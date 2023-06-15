package com.hp.javapgms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KSmallest {
// For smallest use MaxHeap and for highest use minHeap
	
	static class MaxHeapComparator implements Comparator<Integer> {
	    @Override
	    public int compare(Integer number1, Integer number2)
	    {
	        int value = number1.compareTo(number2);
	        // Elements are sorted in reverse order - in general we return value for ascending order
	        if (value > 0) {
	            return -1;
	        }
	        else if (value < 0) {
	            return 1;
	        }
	        else {
	            return 0;
	        }
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,10, 4, 3, 20, 15};
		// Finding 3rd smallest element k=3
		int k =3;
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new MaxHeapComparator());
		for(int i=0;i<arr.length;i++) {
			maxHeap.add(arr[i]);
			if(maxHeap.size() > k) {
				maxHeap.poll();
			}
		}
		System.out.println("Third Smallest Element is: "+maxHeap.peek());
	}

}
