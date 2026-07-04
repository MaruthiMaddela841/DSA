package linkedlist;

// https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleOfTheLinkedList {
	
	public Node middleNodeBetter(Node head) {
		Node slow=head;
		Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        // while(fast.next != null && fast.next.next != null){
        //      slow=slow.next;
        //     fast=fast.next.next;
        // }
        
        return slow;
    }
	
	public Node middleNode(Node head) {
		Node temp=head;
		Node res=head;
        int size=0;
        int start=0;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        if(size%2!=0){
            start=(size/2)+1;
        } else{
            start=size/2;
        }
        for(int i=0;i<start;i++){
                res=res.next;
        }
        return res;
    }

}
