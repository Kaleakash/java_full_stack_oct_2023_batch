package com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// Queue : FIFO
		Queue qq1 = new PriorityQueue();
		Queue qq2 = new LinkedList();
		qq1.add(3);qq1.add(1); qq1.add(7); qq1.add(2);
		qq2.add(3);qq2.add(1); qq2.add(7); qq2.add(2);
		System.out.println(qq1);
		System.out.println(qq2);
		System.out.println("Remove "+qq1.poll());
		System.out.println("Remove "+qq2.poll());
		System.out.println(qq1);
		System.out.println(qq2);
	}

}
