package linkedlist;

// https://leetcode.com/problems/reverse-linked-list/
public class ReversedLinkedList {
	
	public Node reverseList(Node head) {
		Node current=head;
        Node prev=null;
        Node temp;
        while(current!=null){
            temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return prev;
    }

}
