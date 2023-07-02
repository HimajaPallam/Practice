package com.hp.javapgms;

import java.util.HashSet;


/*This can also be solve by : 
	Detect loop in a linked list using Floyd’s Cycle-Finding Algorithm:
	This algorithm is used to find a loop in a linked list. It uses two pointers one moving twice as 
	fast as the other one. The faster one is called the faster pointer and the other one is called
	the slow pointer.
*/
public class LinkedListCycle {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	boolean detectCycle(Node head) {
		HashSet numset = new HashSet();
		while(head!=null) {
			if(numset.contains(head)) {
				return true;
			}
			numset.add(head);
			head = head.next;
		}
		return false;
	}
	
	// Floyd’s Cycle-Finding Algorithm
	boolean detectCycleFloyd(Node head) {
		Node slow_p = head, fast_p= head;
		while(slow_p!=null && fast_p!=null && fast_p.next!=null) {
			slow_p = head.next;
			fast_p = head.next.next;
			if(slow_p == fast_p) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListCycle list = new LinkedListCycle();
		list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.new Node(4);
        list.head.next.next.next.next = list.head.next.next;

        if(list.detectCycleFloyd(list.head)){
        	System.out.println("Contains Cycle");
        } else {
        	System.out.println("Doesn't Contains Cycle");
        }
        	
	}

}
