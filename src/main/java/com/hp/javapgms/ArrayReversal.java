package com.hp.javapgms;

public class ArrayReversal {
	
	static int[] reverse(int[] arr) {
		int n = arr.length;
		int j = n-1;
		for (int i=0;i<=j;i++) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			j=j-1;
		}
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		arr = reverse(arr);
		for (int i =0; i<=arr.length-1;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
}
