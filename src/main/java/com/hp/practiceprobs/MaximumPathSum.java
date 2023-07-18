package com.hp.practiceprobs;

import com.hp.practiceprobs.BinaryTreeHeight.Node;

public class MaximumPathSum {
	static int maxSum = Integer.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeHeight tr = new BinaryTreeHeight();
		tr.root = new Node(-10);
		tr.root.left = new Node(9);
        tr.root.right = new Node(20);
        tr.root.right.left = new Node(15);
        tr.root.right.right = new Node(7);
        findMaxSum(tr.root);
        System.out.println(maxSum);
        
	}
	
	private static int findMaxSum(Node root) {
		if(root == null) {
			return 0;
		}
		
		int l = Math.max(findMaxSum(root.left), 0);
		int r = Math.max(findMaxSum(root.right), 0);
		
		int retMax = root.data+Math.max(l,r);
		int maxs = Math.max(retMax,  l+r+root.data);
		maxSum = Math.max(maxSum, maxs);
		
		return retMax;
	}

}
