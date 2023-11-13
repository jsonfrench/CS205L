package edu.monmouth.qstack;

import java.util.*;

public class QueueAndStack {

	public static void main(String[] args) {
		Deque<Integer> q = new ArrayDeque<>();
		q.addLast(200);
		q.addLast(250);
		q.addLast(50);
		q.addLast(125);

		Integer front = q.getFirst();
		Integer rear = q.getLast();
		System.out.printf("Front: %s Rear: %s%n", front, rear);
		
		Integer removedValue = q.removeFirst();
		System.out.printf("RemovedValue: %s%n", removedValue);
		
		front = q.getFirst();
		rear = q.getLast();
		System.out.printf("Front: %s Rear: %s%n", front, rear);
		
	}

}
