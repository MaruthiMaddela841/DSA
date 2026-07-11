package linkedlist;

// https://leetcode.com/problems/intersection-of-two-linked-lists
public class IntersectionOfTwoLinkedLists {

	public Node getIntersectionNode(Node headA, Node headB) {
        Node first=headA;
        Node second=headB;
        while(first!=second){
            first = (first == null) ? first=headB : first.next;
            second = (second == null) ? second=headA : second.next;
        }
        return first;
    }
}
