package priorityqueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		Queue<Double> queue = new LinkedList<>();

		queue.offer(2.9);
		queue.offer(1.3);
		queue.offer(6.8);
		queue.offer(5.2);
		queue.offer(7.7);

		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		System.out.println("++++++++++++++++++++++++");

		Queue<Double> queue2 = new PriorityQueue<>();

		queue2.offer(2.9);
		queue2.offer(1.3);
		queue2.offer(6.8);
		queue2.offer(5.2);
		queue2.offer(7.7);

		while (!queue2.isEmpty()) {
			System.out.println(queue2.poll());
		}
		
		System.out.println("++++++++++++++++++++++++");

		Queue<Double> queue3 = new PriorityQueue<>(Collections.reverseOrder());

		queue3.offer(2.9);
		queue3.offer(1.3);
		queue3.offer(6.8);
		queue3.offer(5.2);
		queue3.offer(7.7);

		while (!queue3.isEmpty()) {
			System.out.println(queue3.poll());
		}
		
		System.out.println("++++++++++++++++++++++++");

		Queue<String> queue4 = new PriorityQueue<>();

		queue4.offer("Dog");
		queue4.offer("Zebra");
		queue4.offer("Pig");
		queue4.offer("Monkey");
		queue4.offer("Lion");

		while (!queue4.isEmpty()) {
			System.out.println(queue4.poll());
		}
		
		System.out.println("++++++++++++++++++++++++");

		Queue<String> queue5 = new PriorityQueue<>(Collections.reverseOrder());

		queue5.offer("Dog");
		queue5.offer("Zebra");
		queue5.offer("Pig");
		queue5.offer("Monkey");
		queue5.offer("Lion");

		while (!queue5.isEmpty()) {
			System.out.println(queue5.poll());
		}

	}

}
