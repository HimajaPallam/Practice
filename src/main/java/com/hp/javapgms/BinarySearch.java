package com.hp.javapgms;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = {1, 11, 2, 10, 4, 5};
		Arrays.sort(nums);
		// Search element is 5
		for (int i =0; i<=nums.length-1;i++) {
			System.out.println(nums[i]+" ");
		}
		int n = nums.length;
		int searchElem = 5;
		int low = 0;
		int high = n-1;
		while(true) {
			int mid = (low+high)/2;
			
			if(searchElem == nums[mid]) {
				System.out.println("position is: "+(mid+1));
				break;
			} else if(searchElem < nums[mid]) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
	}
}
