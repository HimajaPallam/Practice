package com.hp.practiceprobs;

import com.hp.practiceprobs.BinaryTreeHeight.Node;

public class BinaryTreeSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeHeight tr = new BinaryTreeHeight();
		tr.root = new Node(50);
		tr.root.left = new Node(30);
        tr.root.right = new Node(70);
        tr.root.right.left = new Node(65);
        tr.root.right.right = new Node(85);
        
        if(searchElem(tr.root, 6) != null) {
        	System.out.println("Found");
        } else {
        	System.out.println("Not Found");
        }
	}
	
	private static Node searchElem(Node root, int key) {
		if(root == null || root.data == key) {
			return root;
		}
		
		if(root.data < key) {
			return searchElem(root.right,key);
		}
		return searchElem(root.left,key); 
	}

}
