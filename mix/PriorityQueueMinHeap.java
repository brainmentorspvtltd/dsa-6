package com.dit.dsa.mix;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueMinHeap {
	
	public static void main(String[] args) {
		
		//highest priority - min heap
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		//insert in a heap
		queue.add(10);
		queue.add(30);
		queue.add(20);
		queue.add(400);
		
		System.out.println("Elements are");
		Iterator ptr = queue.iterator();
		while(ptr.hasNext())
		{
			System.out.println(ptr.next());
		}
		
		//highest priority element
		System.out.println("Min heap toppest value is: "+queue.peek());
		
		//delete from a heap
		queue.poll();
		
		System.out.println("After deletion of toppest value the heap elements are");
		Iterator ptr2 = queue.iterator();
		while(ptr2.hasNext())
		{
			System.out.println(ptr2.next());
		}
		
	}

}
