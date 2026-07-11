package linkedlist;

// https://leetcode.com/problems/odd-even-linked-list/
public class OddEvenLinkedList {
	
	public Node oddEvenList(Node head) {
        if(head==null || head.next==null) return head;
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while(odd.next!=null && even.next!=null){
            odd.next=odd.next.next;
            odd=odd.next;
            even.next=even.next.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }

}
