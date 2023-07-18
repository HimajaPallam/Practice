package com.hp.practiceprobs;

public class BinaryTreeHeight {
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data = d;
			left=right =null;
		}
	}
	Node root;
	static int ans =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BinaryTreeHeight tr = new BinaryTreeHeight();
		tr.root = new Node(1);
		tr.root.left = new Node(2);
        tr.root.right = new Node(3);
        tr.root.left.left = new Node(4);
        tr.root.left.right = new Node(5);
        tr.root.left.left.left = new Node(10);
        tr.root.left.left.right = new Node(11);
        tr.root.left.left.right.left = new Node(12);
        tr.root.left.left.right.left.right = new Node(13);
        tr.root.left.right.right = new Node(6);
        tr.root.left.right.right.left = new Node(7);
        tr.root.left.right.right.right = new Node(8);
        tr.root.left.right.right.right.left = new Node(9);
        
       // int maxHgt = findHeight(tr.root);
        int maxDiameter = findDiameter(tr.root);
        System.out.println(maxDiameter-1);
	}
	
	private static int findHeight(Node root) {
		if(root == null) {
			return 0;
		} else {
			int lheight = findHeight(root.left);
			int rheight = findHeight(root.right);
			return 1+Math.max(lheight, rheight);
		}
	}
	
	private static int findDiameter(Node root) {
		
		if (root == null) {
			return 0;
		} else {
			int lheight = findHeight(root.left);
			int rheight = findHeight(root.right);

			int diameter = lheight + rheight + 1;
// Diameter of left and right subtrees, if any one of them is greater than above line diameter then we have return that
			int leftDia = findDiameter(root.left);
			int rightDia = findDiameter(root.right);
			return Math.max(diameter, Math.max(leftDia, rightDia));
		}
		 
		
	}

}
