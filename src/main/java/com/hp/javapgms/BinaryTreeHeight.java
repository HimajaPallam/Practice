package com.hp.javapgms;

public class BinaryTreeHeight {
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	int finMaxHeight(Node node) {
		if (node == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int lDepth = finMaxHeight(node.left);
            int rDepth = finMaxHeight(node.right);
 
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeHeight tr = new BinaryTreeHeight();
		tr.root = new Node(1);
		tr.root.left = new Node(2);
        tr.root.right = new Node(3);
        tr.root.left.left = new Node(4);
        tr.root.left.right = new Node(5);
       // tr.root.left.right.left = new Node(6);
        
        int height = tr.finMaxHeight(tr.root);
        System.out.println(height);
	}

}
