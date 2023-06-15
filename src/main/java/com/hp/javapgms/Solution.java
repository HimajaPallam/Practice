package com.hp.javapgms;

import java.util.ArrayList;
import java.util.List;
//Array to BST
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
		sortedArrayToBST(arr);
	}
	
	public static int[] sortedArrayToBST(int[] nums)
    {
        // Code here 
        Node root;
        Node resultNode = arrayToBST(nums, 0, nums.length-1);
        List<Integer> result=new ArrayList<Integer>();
        preorderTraversal(resultNode, result);
        int[] resultset = result.stream().mapToInt(Integer::intValue).toArray();
        return resultset;
    }
    
    private static Node arrayToBST (int[] nums, int start, int last){
        if(start > last){
            return null;
        }   
        int mid = (start + last) / 2;
        Node node = new Node(nums[mid]);
        node.left = arrayToBST(nums, start, mid-1);
        node.right = arrayToBST(nums, mid+1, last);
        return node;
    }
    private static void preorderTraversal (Node node, List<Integer> result){
        if(node==null){
            return;
        }
        result.add(node.elem);
        preorderTraversal(node.left,result);
        preorderTraversal(node.right,result);
    }
}

class Node {
    int elem;
    Node left, right;
    Node(int e){
        elem = e;
        left = right = null;
    }
}
