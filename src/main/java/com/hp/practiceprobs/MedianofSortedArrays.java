package com.hp.practiceprobs;

public class MedianofSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,8,10,20}, b[] = {900};
		int i=0,j=0,count=0;
		int finalLen = (a.length+b.length)/2 + 1;
		int[] c = new int[finalLen];
		while(count < finalLen) {
			if(i!=a.length && j!=b.length)
				c[count++] = a[i]<=b[j]?a[i++]:b[j++];
			else if(j<b.length) 
				c[count++] = b[j++];
			else
				c[count++] = a[i++];
		}
		
		int median = (a.length+b.length) % 2 == 0 ? (c[finalLen-2] + c[finalLen-1]) / 2: c[finalLen-1]; 
		System.out.println(median);
	}

}
