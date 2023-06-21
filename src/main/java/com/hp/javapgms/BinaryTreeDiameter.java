package com.hp.javapgms;

import com.hp.javapgms.BinaryTree.Node;

public class BinaryTreeDiameter {
	Node root;
	static class Node{
		int data;
		Node left, right;
		
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	private int findDiameter(Node root) {
		if (root == null)
            return 0;
		// get the height of left and right sub-trees
        int lheight = height(root.left);
        int rheight = height(root.right);
 
        // get the diameter of left and right sub-trees
        int ldiameter = findDiameter(root.left);
        int rdiameter = findDiameter(root.right);
        
        return Math.max(lheight + rheight + 1,
                Math.max(ldiameter, rdiameter));
	}
	
	static int height(Node node)
    {
        // base case tree is empty
        if (node == null)
            return 0;
 
        // If tree is not empty then height = 1 + max of
        //  left height and right heights
        return (1
                + Math.max(height(node.left),
                           height(node.right)));
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeDiameter tr = new BinaryTreeDiameter();
		tr.root = new Node(1);
		tr.root.left = new Node(2);
        tr.root.right = new Node(3);
        
		System.out.println(tr.findDiameter(tr.root));
	}

}
