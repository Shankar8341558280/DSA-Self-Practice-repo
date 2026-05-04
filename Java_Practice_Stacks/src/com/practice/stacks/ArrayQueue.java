package com.practice.stacks;

public class ArrayQueue {
	private int arrayQueue[];
	private int topIndex;
	private int lastIndex;
	private int capacity;
	
	public ArrayQueue(int size)
	{
		capacity = size;
		topIndex = - 1;
		lastIndex = -1;
		arrayQueue = new int[capacity];
	}
	
	public void push(int num)
	{
		if (topIndex == capacity)
		{
			System.out.println("Queue Overflow");
			return;
		}
		arrayQueue[++topIndex] = num;
	}
	
	public int pop()
	{
		int poppedEle = -1;
		if (isEmpty() )
		{
			System.out.println("Queue Underflow");
			return poppedEle;
		}
		poppedEle = arrayQueue[++lastIndex];
		return poppedEle;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue Underflow");
			return topIndex;
		}
		return arrayQueue[topIndex];
	}
	
	public boolean isEmpty()
	{
		if (topIndex == lastIndex )
		{
			return true;
		}
		return false;
	}
}
