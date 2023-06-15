package com.hp.javapgms;

public class MaxSumContiguousArray {
//Kandane's Algorithm
	public static void main(String[] args) {
		int[] nums = {1, 11, 2, -10, 4, -5};
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			sum = sum+nums[i];
			maxSum = Math.max(maxSum, sum);
			if(sum < 0) {
				sum=0;
			}
		}
		System.out.println("Max Sum is:"+maxSum);
	}
}
