package com.hp.javapgms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 11, 2, 1, 4, 2};
		
		Map<Integer, Integer> arrMap = new HashMap<Integer, Integer>();
		for(int i : nums) {
			if(arrMap.containsKey(i)) {
				arrMap.put(i, arrMap.get(i)+1);
			} else {
				arrMap.put(i, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> em: arrMap.entrySet()) {
			if(em.getValue() > 1) {
				System.out.println("Duplicate Entry is:"+em.getKey());
			}
		}
		
	}

}
