package com.practice.stacks;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> q = new LinkedList<>();
	
	public void push(int num)
	{
		 int s = q.size();
		 
		 q.add(num);
		 
		 for (int i = 0; i < s; i++)
		 {
			 q.add(q.poll());
		 }
	}
	
	public int pop()
	{
		int num = q.peek();
		
		q.poll();
		
		return num;
	}
	
	public int top()
	{
		return q.peek();
	}
	
	public boolean isEmpty()
	{
		return q.isEmpty();
	}
}
