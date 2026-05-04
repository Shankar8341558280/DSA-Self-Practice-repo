package com.practice.stacks;



class LinkedListStack
{
	private Node head;
	private int size;
	
	public LinkedListStack() {
        head = null;
        size = 0;
    }
	
	public void push(int x)
	{
		Node elementNode = new Node(x);
		
		elementNode.next = head;
		
		head = elementNode;
		
		size++;
	}
	
	public int pop()
	{
		if (head == null)
		{
			return -1;
		}
		
		int val = head.val;
		Node temp = head;
		head = head.next;
		size--;
		
		return val;
	}
	
	public int peek()
	{
		if (head == null)
		{
			return -1;
		}
		
		return head.val;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
}
public class StackLinedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Node
{
	int val;
    Node next;
    Node(int d) {
        val = d;
        next = null;
    }
}