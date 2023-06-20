package com.hp.javapgms;

public class MinimumSwapKtogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 7, 9, 5, 8, 7, 4} ;
		int k = 4;
		int count = 0,bad=0;
		int minswaps=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(k>=arr[i]) {
				count++;
			}
		}
		
		for(int i=0;i<count;i++) {
			if(arr[i]>k) {
				bad++;
			}
		}
		
		for(int i=0,j=count;j<arr.length;i++,j++) {
			if(arr[i]>k) {
				bad--;
			}
			if(arr[j]>k) {
				bad++;
			}
			minswaps = Math.min(minswaps, bad);
		}
		
		System.out.println("Minimum swaps required:"+minswaps);
		
	}

}
