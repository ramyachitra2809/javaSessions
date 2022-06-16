package collections;

import org.w3c.dom.Node;

public class CustomLinkedList {
	
	Node head;
	 
	  class Node{
		  
		  Node next;
		  int data; 
	  
	  Node(int data){
		  this.data=data;
		  next=null;
	  }
	  }
	public static void main(String[] args) {
		CustomLinkedList ll= new CustomLinkedList();
		Node fst=ll.new Node(10);
		ll.head=fst;
		Node snd=ll.new Node(20);
		fst.next=snd;
		Node trd=ll.new Node(30);
		snd.next=trd;
		ll.printing();

	}
	
	public void printing() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	

}
