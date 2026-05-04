package com.practice.stacks;

import java.time.temporal.Temporal;

public class QueueLinkedList {
	private Node start;
	private Node end;
	private int size;
	
	public QueueLinkedList()
	{
		start = end = null;
		size = 0;
	}
	
	public void push(int num)
	{
		Node newNode = new Node(num);
		
		if (start == null)
		{
			start = end = newNode;
		}
		else {
			end.next = newNode;
			end = newNode;
		}
		size++;
	}
	
	public int pop()
	{
		if (start == null)
		{
			return -1;
		}
		Node tempNode = start;
		start = start.next;
		tempNode.next = null;
		size--;
		return tempNode.val;
	}
	
	public int peek()
	{
		if (start == null)
		{
			return -1;
		}
		return start.val;
	}
	
	public boolean isEmpty()
	{
		return start == null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

