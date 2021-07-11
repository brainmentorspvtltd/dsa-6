package com.dit.dsa.mix;

import java.util.Stack;

public class QueueUsingSingleStack {
	
	Stack<Integer> stack = new Stack<>();
	
	public void enqueue(int value)
	{
		stack.push(value);
	}
	
	public int dequeue()
	{
		if(stack.size() == 0)
		{
			System.out.println("Queue is Empty");
		}
		
		if(stack.size() == 1)
		{
			return stack.pop();
		}
		
		int data = stack.pop();
		int resultValue = dequeue();
		stack.push(data);
		
		return resultValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueUsingSingleStack queue = new QueueUsingSingleStack();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

	}

}
