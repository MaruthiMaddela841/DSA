package linkedlist;

// https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {

	public Node addTwoNumbers(Node l1, Node l2) {
        if(l1==null && l2==null) return null;
        if(l1==null && l2!=null) return l2;
        if(l1!=null && l2==null) return l1;
        Node x=l1;
        Node y=l2;
        int carrier=0;
        int reminder=0;
        Node res=new Node(0);
        Node track=res;
        while(x!=null && y!=null){
            int sum=x.value+y.value+carrier;
            carrier=sum/10;
            reminder=sum%10;
            Node temp=new Node(reminder);
            track.next=temp;
            x=x.next;
            y=y.next;
            track=track.next;
        }
        while(x!=null){
            int sum=x.value+carrier;
            carrier=sum/10;
            reminder=sum%10;
            Node temp=new Node(reminder);
            track.next=temp;
            x=x.next;
            track=track.next;
        }
        while(y!=null){
            int sum=y.value+carrier;
            carrier=sum/10;
            reminder=sum%10;
            Node temp=new Node(reminder);
            track.next=temp;
            y=y.next;
            track=track.next;
        }
        if(carrier>0){
            Node temp=new Node(carrier);
            track.next=temp;
        }
        return res.next;
    }
}
