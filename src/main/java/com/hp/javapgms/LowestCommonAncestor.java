package com.hp.javapgms;

public class LowestCommonAncestor {
	class Node {
	    int data;
	    Node left, right;
	 
	    public Node(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	}
	Node root;
	 
    Node findLCA(int n1, int n2)
    {
        return findLCA(root, n1, n2);
    }
    
    Node findLCA(Node node, int n1, int n2)
    {
        if (node == null)
            return null;
 
        if (node.data == n1 || node.data == n2)
            return node;
 
        Node left_lca = findLCA(node.left, n1, n2);
        Node right_lca = findLCA(node.right, n1, n2);
 
        if (left_lca != null && right_lca != null)
            return node;
 
        return (left_lca != null) ? left_lca : right_lca;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LowestCommonAncestor tree = new LowestCommonAncestor();
		tree.root = tree.new Node(1);
        tree.root.left = tree.new Node(2);
        tree.root.right = tree.new Node(3);
        tree.root.left.left = tree.new Node(4);
        tree.root.left.right = tree.new Node(5);
        tree.root.right.left = tree.new Node(6);
        tree.root.right.right = tree.new Node(7);
        
        System.out.println(tree.findLCA(7, 6).data);
	}

	
}
