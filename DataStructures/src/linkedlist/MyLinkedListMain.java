package linkedlist;

// https://leetcode.com/problems/design-linked-list/
public class MyLinkedListMain {

	public static void main(String[] s) {
		MyLinkedList linkedList = new MyLinkedList();
	}
	
	

}

class Node{
    int value;
    Node next;

    Node(int value){
        this.value=value;
    }
}

class MyLinkedList {

    

    int size;
    Node head;
    Node tail;


    public MyLinkedList() {
        head=null;
        tail=null;
        this.size=0;
    }
    
    public int get(int index) {

        if(index<0 || index>=size){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.value;
        
    }
    
    public void addAtHead(int val) {
        Node node=new Node(val);
        if(size==0){
            head=node;
            tail=node;
        }else{
            node.next=head;
            head=node;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node node=new Node(val);
        if(size==0){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        Node newNode=new Node(val);
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size){
            return;
        }
        if(index==0){
            head=head.next;
            if(size==1){
                tail=null;
            }
            size--;
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        if(index==size-1){
            temp.next=null;
            tail=temp;
            size--;
            return;
        }
        Node nodeToDelete=temp.next;
        temp.next=nodeToDelete.next;
        size--;
    }
}