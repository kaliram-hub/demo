package com.token.app;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TokenQueue {

	static int i;
	static int maxLimit=10;
	static int minLimit=5;
	static Queue<Integer> queue;
	
 
	static void tokenGenrate() {
		Stack<Integer> stack = new Stack<>();
		while (!queue.isEmpty()) {
			stack.add(queue.peek());
			System.out.println("Reac 1st method");
			queue.remove();
		}
		while (!stack.isEmpty()) {
			queue.add(stack.peek());
			System.out.println(stack.pop());
		
			if( queue.size() == minLimit && queue.size() <= maxLimit) {
				for (int i = queue.size(); i < maxLimit; i++) {
					queue.add(i);
				}
			}
			
		}
	}

	public static void main(String[] args) {

		queue = new LinkedList<Integer>();
//	PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		
		// Adds elements {0, 1, 2, 3, 4} to queue
		for (int i = 0; i < 5; i++)
			queue.add(i);
		int size = queue.size();
//	for (int i = Queue.Length; i >= 0; i--)
//	{
//
//	}

		System.out.println(queue);
		System.out.println(queue.size());
		tokenGenrate();
		System.out.println(queue);
	
		
//		Integer removedElement = queue.poll();
		
//		Integer removedElement = queue.pop();
//	for (int i = queue.length; i >= 0; i--) {
//		
//		System.out.println(queue);
//	}

//    // Creating an iterator 
//    Iterator value = queue.iterator(); 
//    for (int i = queue.l; i >= 0; i--) {
//    	
//
//    }
//    
// // Displaying the values after iterating through the queue 
//    System.out.println("Available Tokens:"); 
//    while (value.hasNext()) { 
//        System.out.println(value.next()); 
//    } 

	}
	
	
	
}
