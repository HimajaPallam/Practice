package com.hp.javapgms;
public class BalancedTreeHeight {

	Node root;
	class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	boolean isBalanced(Node root) {
	     if(root == null) {
			 return true;
		 }
		int lh = findHeight(root.left);
		int rh = findHeight(root.right);
		if(Math.abs(lh-rh)<=1) {
			return true;
		} 
		return false;
	}
	
	static int findHeight(Node root) {
		
	  if(root == null) {
		  return 0;
	  }
	  int lheight = findHeight(root.left);
	  int rheight = findHeight(root.right);
	  return 1+Math.max(lheight, rheight);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BalancedTreeHeight th = new BalancedTreeHeight();
		th.root = th.new Node(1);
		th.root.left = th.new Node(2);
		th.root.right = th.new Node(3);
		th.root.left.left = th.new Node(4);
		th.root.left.right = th.new Node(5);
		th.root.left.right.left = th.new Node(6);
		if(th.isBalanced(th.root)) {
			System.out.println("Tree is Balanced");
		} else {
			System.out.println("Tree is not Balanced");
		}
	}

}
