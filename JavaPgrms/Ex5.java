package ust.examples;

import java.util.PriorityQueue;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creating empty priority queue
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		//adding items to the pQueue using add()
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		//printing the top element of priorityqueue
		System.out.println(pQueue.poll());
		//printing the top element again
		System.out.println(pQueue.peek());
	}

}
