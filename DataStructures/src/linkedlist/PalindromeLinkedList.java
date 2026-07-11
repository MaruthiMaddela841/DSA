package linkedlist;

public class PalindromeLinkedList {
	public boolean isPalindrome(Node head) {
		Node slow = head;
		Node fast = head;
		Node prev = null;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node current = slow;
		if (fast != null) {
			current = slow.next;
		}

		while (current != null) {
			Node nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}

		while (prev != null) {
			if (prev.value != head.value) {
				return false;
			}
			prev = prev.next;
			head = head.next;
		}
		return true;
	}
}
