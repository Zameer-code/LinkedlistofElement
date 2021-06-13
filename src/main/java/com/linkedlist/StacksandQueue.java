package com.linkedlist;

import java.util.Stack;

public class StacksandQueue {
	
	 private Stack stack1 = new Stack<>();
	   private Stack stack2 = new Stack<>();
	   public void enqueue(int element) {
	      stack1.push(element);
	      System.out.println(element + " inserted");
	   }
	   public void dequeue() {
	      if(stack2.isEmpty()) {
	         while (!stack1.isEmpty()) {
	            stack2.push(stack1.pop());
	         }
	      }
	      System.out.println(stack2.pop() + " removed");
	   }
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
