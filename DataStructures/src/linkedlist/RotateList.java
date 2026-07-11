package linkedlist;

// https://leetcode.com/problems/rotate-list
public class RotateList {
	public Node rotateRight(Node head, int k) {
        if (head == null || head.next == null) return head;
        Node tail=head;
        int length=1;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }
        int rotation =k%length;
        Node start=head;
        if(rotation==0){
            return head;
        }else{
            tail.next=head;
            int stepsToNewTail = length - rotation - 1;
            while(stepsToNewTail>0){
                start=start.next;
                stepsToNewTail--;
            }
            head=start.next;
            start.next=null;
        }
        return head;
    }
}
