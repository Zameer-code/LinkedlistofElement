package com.linkedlist;

import java.util.Stack;

public class StacksandQueue {
	/**
	 * Creating a stack of given Elements
	 */
	
	 private Stack stack1 = new Stack<>();
	   private Stack stack2 = new Stack<>();
	   public void enqueue(int element) {
	      stack1.push(element);
	      System.out.println(element + " inserted");
	   }
	   /**
	    * Dequeueing of given Element
	    */
	   public void dequeue() {		
	      if(stack2.isEmpty()) {	//push and pop till the stack is empty
	         while (!stack1.isEmpty()) {
	            stack2.push(stack1.pop());
	         }
	      }
	      System.out.println(stack2.pop() + " removed");
	   }
	   /**
	    * Test and Dequeuing of the elements from the begining
	    * @param printing outputs of queue and dequeue
	    */
	   public static void main(String args[]) {
		  StacksandQueue test = new StacksandQueue();
	      test.enqueue(56);
	      test.enqueue(30);
	      test.enqueue(70);
	      test.dequeue();
	      test.dequeue();
	      test.dequeue();
	   }
}
