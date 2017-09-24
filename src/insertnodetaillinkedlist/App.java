package insertnodetaillinkedlist;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
  class Node {
	     int data;
	     Node next;
	  }
	Node Insert(Node head,int data) {
	// This is a "method-only" submission. 
	// You only need to complete this method. 
	  Node current = head;
	  Node node = new Node();
	  node.data = data;
	  node.next = null;
	  if (head == null) {
		  head = node;
		  return head;
	  }
	  while(current.next!=null) {
		  current = current.next;
	  }
	  current.next = node;
	  return head;
	}
}
