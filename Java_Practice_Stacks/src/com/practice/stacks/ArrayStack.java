package com.practice.stacks;

public class ArrayStack {
	
	int stackArray[];
	public int elementCount = -1;
	ArrayStack(int length)
	{
		stackArray = new int[length];
	}

	public void push(int num)
	{
		if (elementCount < stackArray.length - 1)
		{
			stackArray[++elementCount] = num;
		}
		else
		{
			System.out.println("Maximum Element Count reached");
		}
	}
	
	public int pop()
	{
		int poppedElement = -1;
		if (elementCount > -1)
		{
			poppedElement = stackArray[elementCount - 1];
			stackArray[elementCount--] = 0;
		}
		return poppedElement;
	}
	
	public int peek()
	{
		if (elementCount != -1)
			return stackArray[elementCount];
		return -1;
	}
	
	public boolean isEmpty()
	{
		return elementCount == -1;
	}
	
	
}
