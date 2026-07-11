package linkedlist;

// https://leetcode.com/problems/remove-linked-list-elements/
public class RemoveLinkedListElements {
	
	public Node removeElements(Node head, int val) {
        Node dummy=new Node(0);
        dummy.next=head;
        Node track=dummy;
        Node start=head;
        while(start!=null){
            if(start.value==val){
                track.next=start.next;
                start=track.next;
            }else{
                start=start.next;
                track=track.next;
            }
        }
        return dummy.next;
    }
}
