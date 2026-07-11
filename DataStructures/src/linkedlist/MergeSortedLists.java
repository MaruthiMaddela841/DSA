package linkedlist;

// https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeSortedLists {
	public Node mergeTwoLists(Node list1, Node list2) {
	       Node res= new Node(-101);
	       Node x=list1;
	       Node y=list2;
	       Node track=res;
	       while(x!=null && y!=null){
	        if(x.value<=y.value ){
	            track.next=new Node(x.value);
	            x=x.next;
	            track=track.next;
	        }else if(x.value>=y.value ){
	            track.next=new Node(y.value);
	            y=y.next;
	            track=track.next;
	        }
	       }
	       while(x!=null){
	            track.next=new Node(x.value);
	            x=x.next;
	            track=track.next;
	       }
	       while(y!=null){
	            track.next=new Node(y.value);
	            y=y.next;
	            track=track.next;
	       }
	       return res.next;
	    }
}
