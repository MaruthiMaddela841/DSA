package linkedlist;

// https://leetcode.com/problems/swap-nodes-in-pairs/
public class SwapPairs {
	public Node swapPairs(Node head) {
        if(head==null || head.next==null) return head;
        Node first=head;
        Node second=head.next;
        Node prev=new Node(0);
        prev.next=head;
        while(first!=null && second!=null){
            Node temp=second;
            prev.next=temp;
            prev=prev.next;
            first.next=second.next;
            prev.next=first;
            if(first==head){
                head=second;
            }
            first=second;
            second=first.next;
            prev=prev.next;
            first=second.next;
            if(first!=null){
                second=first.next;
            }
        }
        return head;
    }
}
