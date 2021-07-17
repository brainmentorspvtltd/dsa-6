package com.dit.dsa.mix;

public class MinHeapTree {
	
	int heap[];
	int size;
	int maxSize;
	
	MinHeapTree(int maxSize)
	{
		this.maxSize = maxSize;
		this.size = 0;
		heap = new int[this.maxSize+1];
		heap[0] = Integer.MIN_VALUE;
	}
	
	int parent(int i)
	{
		return i / 2;
	}
	
	void swap(int i, int j)
	{
		int temp;
		temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
	
	void insert(int value)
	{
		heap[++size] = value;
		
		int  current = size;
		
		while(heap[current] < heap[parent(current)]) // fix violated property
		{
			swap(current, parent(current));
			current = parent(current);
		}	
	}
	
	void print()
	{
		for(int i = 1; i <= size / 2; i++)
		{
			System.out.println("\nParent:"+heap[i]+" Left Child:"+heap[2 * i]+" Right Child:"+heap[2 * i + 1]);
		}
	}
	
	public static void main(String[] args) {
		
		MinHeapTree minHeap = new MinHeapTree(5);
		
		minHeap.insert(5);
		minHeap.insert(3);
		minHeap.insert(17);
		minHeap.insert(10);
		minHeap.insert(84);
		
		minHeap.print();
		
	}

}
