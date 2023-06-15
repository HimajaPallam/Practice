package com.hp.javapgms;

public class MinAndMaxElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 11, 2, 10, 4, 5};
		
		int n = nums.length;
		int minElem = nums[0];
		int maxElem = nums[0];
		for(int i=1;i<n;i++) {
			minElem = Math.min(minElem, nums[i]);
			maxElem = Math.max(maxElem, nums[i]);
		}
		System.out.println("Max and Min Elems are: "+maxElem+" and "+minElem);
	}

}
