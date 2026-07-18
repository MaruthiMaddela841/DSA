package priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class EmployeeQueue {

	public static void main(String[] args) {
		EmployeeComparator comparator=new EmployeeComparator();
		Queue<Employee> q=new PriorityQueue<>(comparator);
//		Queue<Employee> q=new PriorityQueue<>(comparator.reversed());
		q.offer(new Employee("Jack",100.0));
		q.offer(new Employee("Samuel",140.0));
		q.offer(new Employee("Dean",654.0));
		q.offer(new Employee("Odyssey",300.0));
		q.offer(new Employee("Micheal",450.0));
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}

}
