package com.practice.stacks;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayStack aStack = new ArrayStack(4);
		System.out.println("Element Count : "+aStack.elementCount);
		System.out.println("Peek Element : "+aStack.peek());
		
		aStack.push(10);
		System.out.println("Element Count : "+aStack.elementCount);
		System.out.println("Peek Element : "+aStack.peek());
		
		aStack.push(5);
		System.out.println("Element Count : "+aStack.elementCount);
		System.out.println("Peek Element : "+aStack.peek());
		
		aStack.push(6);
		System.out.println("Element Count : "+aStack.elementCount);
		System.out.println("Peek Element : "+aStack.peek());
		
		aStack.push(11);
		System.out.println("Element Count : "+aStack.elementCount);
		System.out.println("Peek Element : "+aStack.peek());
		
		aStack.push(13);
		System.out.println("Element Count : "+aStack.elementCount);
		System.out.println("Peek Element : "+aStack.peek());
		
		
		System.out.println("-----POP-----");
		aStack.pop();
		System.out.println("Element Count : "+aStack.elementCount);
		System.out.println("Peek Element : "+aStack.peek());
		System.out.println("Is Empty : "+aStack.isEmpty());

	}

}
