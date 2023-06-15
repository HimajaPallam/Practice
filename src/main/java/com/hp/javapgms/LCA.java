package com.hp.javapgms;
// Java Program for Lowest Common Ancestor
// in a Binary Tree
// A O(n) solution to find LCA of
// two given values n1 and n2

import java.util.ArrayList;
import java.util.List;

// A Binary Tree node
public class LCA {
	class Node {
		int data;
		Node left, right;

		Node(int value)
		{
			data = value;
			left = right = null;
		}
	}

//	class Solution
//	{
//	    //Function to return the lowest common ancestor in a Binary Tree.
//		Node lca(Node root, int n1,int n2)
//		{
//			// Your code here
//			if(root == null){
//			    return null;
//			}
//			if(root.data == n1 || root.data == n2){
//			    return root;
//			}
//			Node left_lca = lca(root.left,n1,n2);
//			Node right_lca = lca(root.right,n1,n2);
//			
//			if(left_lca!=null && right_lca!=null){
//			    return root;
//			}
//			
//			if(left_lca!=null){
//			    return left_lca;
//			} else{
//			    return right_lca;
//			}
//		}
//		
//	}
}
