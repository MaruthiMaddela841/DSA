package linkedlist;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RemoveDuplicatesFromSortedList {
	public Node deleteDuplicates(Node head) {
        if(head==null){
            return null;
        }
        Node slow=head;
        Node fast=head.next;
        while(fast!=null){
            if(slow.value==fast.value){
                Node temp=fast.next;
                slow.next=fast.next;
                fast=temp;
            }else{
                slow=slow.next;
                fast=fast.next;
            }
        }
        return head;
    }
}
