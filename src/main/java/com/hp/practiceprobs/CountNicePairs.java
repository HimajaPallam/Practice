package com.hp.practiceprobs;

import java.util.*;

public class CountNicePairs {
	// Method - 2
	
	static int reverse_2(int n){
		int res =0;
		while(n!=0) {
			res= (res*10) + (n%10);
			n /= 10;
		}
		return res;
	}
	
	public static int countNicePairs_2(int[] nums) {
		// A + rev(B) = rev(A) + B
		// A - rev(A) = B - rev(B)

		int result =0;
		// Trying to put into map
		Map<Integer, Integer> resmap = new HashMap<>();
		for(int i : nums) {
			int diff = i - reverse_2(i);
			if(!resmap.containsKey(diff)) {
				resmap.put(diff,0);
			} else {
				resmap.put(diff, resmap.get(diff)+1);
			}
		}
		
		// If we have count = 2, we have (A-rev(A)) = (B-rev(B)) , so 1 nice pair
        // If we have count = 3, we have (A-rev(A)) = (B-rev(B)) = (C-rev(C)), so (A,B) (B,C) (A,C) = 3 pairs
		// So we have count * (count-1) permutations, but since (A,B) and (B,A) are treated as 1 pair, we divided by 2.
		
		for(Integer key: resmap.keySet()) {
			int count = resmap.get(key);
			result += count;
		}
		return result;
		
    }
	
	
	// Method -1
	static int reverse(int n){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%10);
            n = n/10;
        }
        return Integer.parseInt(sb.toString());
    }

    public static int countNicePairs(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length-1;i++){
        	for(int j =i+1;j<nums.length;j++) {
	            int sum = nums[i] + reverse(nums[j]);
	            if(sum - nums[j] == reverse(nums[i])){
	                count += 1;
	            }
        	}
        }
        return count;
    }
    
    public static void main(String[] args) {
    	int[] nums = {42,11,1,97};
    	System.out.println(countNicePairs_2(nums));
    }
}
