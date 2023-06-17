package com.hp.javapgms;

public class LinkedList_Middle {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}

	/* Function to get middle element of Linked list */ 
	public void getMidElement(Node node) {
		int l = getlength(node);
		int s = 1;
		while(s <=l) {
			node = node.next;
			s++;
		}
		System.out.print(node.data);
	}
	
	int getlength(Node node) {
		int l = 1;
		while(node.next!=null) {
			node = node.next;
			l++;
		}
		return l/2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_Middle list = new LinkedList_Middle();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
	    
        list.getMidElement(head);
	        
	}

}
