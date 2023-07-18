package com.hp.practiceprobs;

import java.util.*;

public class LargestNumberwithArray {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] inarr = {1, 34, 3, 98, 9, 76, 45, 4};
		
		ArrayList<Integer> arr = new ArrayList<>();
	    arr.add(1);
	    arr.add(34);
	    arr.add(3);
	    arr.add(98);
	    arr.add(9);
	    arr.add(76);
	    arr.add(45);
	    arr.add(4);
	   // printLargest(arr);
	    List<String> arrs = new ArrayList<>();
	    for(Integer a:arr) {
	    	arrs.add(Integer.toString(a));
	    }
	    
	    
	    Collections.sort(arrs, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				String ab = a+b;
				String ba = b+a;
				
				return ab.compareTo(ba)>0?-1:1;
			}

	    });
	    
	    arrs.forEach(System.out::print);
	 
	}

}
