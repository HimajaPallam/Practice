package com.hp.practiceprobs;

import java.util.Arrays;

public class QuickSort {
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	// finding partition by sorting elems
	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return i+1;
	}
	
	static void quicksort(int[] arr, int low, int high) {
		if(low < high) {
			int pivot = partition(arr, low, high);
			quicksort(arr,low,pivot-1);
			quicksort(arr, pivot+1,high);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		quicksort(arr,0,arr.length-1);
		
		Arrays.stream(arr).forEach(System.out::println);
	}

}
