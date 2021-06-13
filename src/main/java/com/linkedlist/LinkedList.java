package com.linkedlist;

public class LinkedList<T> {
	
	// head -> null
	  // head -> node -> null
	  // head -> node -> node -> node -> node -> null
	  Node<T> head;
	  
	  /**
	   *  
	   * @param data append element
	   */

	  public void add(T data) {
	    Node<T> newNode = new Node<>();
	    newNode.data = data;
	    if (head == null) {
	      head = newNode;
	    } else {
	      Node<T> node = head;
	      while (node.next != null) {
	        node = node.next;
	      }
	      node.next = newNode;
	    }
	  }
	  	
	  /**
	   * Element added at start
	   * @param data
	   */
	  public void addAtStart(T data) {
	    Node<T> newNode = new Node<>();
	    newNode.data = data;
	    newNode.next = head;
	    head = newNode;
	  }
	  /**
	   * Element addded at index
	   * @param index
	   * @param data
	   */

	  public void add(int index, T data) {
	    Node<T> newNode = new Node<>();
	    newNode.data = data;

	    if (index == 0) {
	      addAtStart(data);
	    } else {
	      Node<T> node = head;
	      for (int i = 0; i < index - 1; i++) {
	        node = node.next;
	      }
	      newNode.next = node.next;
	      node.next = newNode;
	    }
	  }
	  /**
	   * Elements we get @first as output
	   */
	    
	    public void getFirst() {
	        if (head == null) {
	            return;
	        } else {
	            Node<T> newHead = head.next;
	            head = newHead;
	        }
	    }

	    /**
	     * Elements we get @last as output
	     */
	    public void getLast() {
	        Node<T> previousNode = head;
	        Node<T> currentNode = head;

	        while (currentNode.next != null) {
	            previousNode = currentNode;
	            currentNode = currentNode.next;
	        }
	        previousNode.next = null;
	    }

	    /**
	     * search method for data
	     *
	     * @param using for loop
	     *            
	     * @return Index 
	     */
	    public int search(T data) {
	        Node<T> currentNode = head;
	        int i = 0;

	        while (currentNode.next != null) {
	            if (currentNode.data == data) {
	                break;
	            }
	            currentNode = currentNode.next;
	            if (currentNode == null) {
	                return -1;
	            }
	            i++;
	        }
	        return i;
	    }

	    /**
	     * Deleting the element
	     *
	     * @param index
	     */
	    public void remove(int index) {
	        if (index == 0) {
	            head = head.next;
	        } else {
	            Node<T> node = head;
	            Node<T> node1 = null;
	            for (int i = 0; i < index - 1; i++) {
	                node = node.next;
	            }
	            node1 = node.next;
	            node.next = node1.next;
	        }
	    }


	    /**
	     * printing of Element till null
	     * Sysout
	     * 
	     */

	    public void show() {
	        Node<T> node = head;
	        while (node.next != null) {
	            System.out.println(node.data);
	            node = node.next;
	        }
	        System.out.println(node.data);
	    }

	    /**
	     * Size of the Element
	     *
	     * @return count size
	     */
	    public int size() {
	        Node<T> currentNode = head;
	        int count = 0;
	        while (currentNode != null) {
	            currentNode = currentNode.next;
	            count++;
	        }
	        return count;
	    }

		public int search(int data) {
			
			// TODO Auto-generated method stub
			return 0;
		}
	  }


