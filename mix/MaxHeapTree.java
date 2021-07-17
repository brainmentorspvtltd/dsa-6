package com.dit.dsa.mix;

public class MaxHeapTree {
	
	int heap[];
	int size;
	int maxSize;
	
	MaxHeapTree(int maxSize)
	{
		this.maxSize = maxSize;
		this.size = 0;
		heap = new int[this.maxSize+1];
		heap[0] = Integer.MAX_VALUE;
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
		
		while(heap[current] > heap[parent(current)])
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
		
		MaxHeapTree maxHeap = new MaxHeapTree(5);
		
		maxHeap.insert(5);
		maxHeap.insert(3);
		maxHeap.insert(17);
		maxHeap.insert(10);
		maxHeap.insert(84);
		
		maxHeap.print();
		
	}

}
