package com.linkedlist;

public class Runner {
			
	
	public static void main(String[] args) {
				
		numberList.add(56);
	        numberList.add(30);
	        numberList.add(40);
	        numberList.add(70);
	        numberList.show();
	        System.out.println();
	        System.out.println("post deletion..");
	        int result = numberList.search(40);
	        numberList.remove(result);
	        int Size = numberList.size();
	        numberList.show();
	        System.out.println("Size of list " + Size);
	        
	    }
}
