package com.practice.stacks;

public class ArrayQueueMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue aQueue = new ArrayQueue(4);
		aQueue.pop();
		
		aQueue.push(10);
		
		System.out.println("PeekElement :" + aQueue.peek());
		
		aQueue.push(15);
		
		System.out.println("PeekElement :" + aQueue.peek());
		
		aQueue.push(119);
		
		System.out.println("PeekElement :" + aQueue.peek());
		
		System.out.println("Popped : " + aQueue.pop());
		System.out.println("PeekElement :" + aQueue.peek());
	}

}
