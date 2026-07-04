package linkedlist;

// https://leetcode.com/problems/linked-list-cycle-ii/
public class LinkedListCycleII {

	public Node detectCycle(Node head) {
		// x=nL-y;
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}
		if (fast == null || fast.next == null) {
			return null;
		} else {
			Node meetingNode = slow;
			Node headNode = head;

			while (headNode != meetingNode) {
				headNode = headNode.next;
				meetingNode = meetingNode.next;
			}
			return meetingNode;
		}
	}
}
