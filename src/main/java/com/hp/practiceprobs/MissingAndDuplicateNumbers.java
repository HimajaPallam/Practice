package com.hp.practiceprobs;

public class MissingAndDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		int[] arr = {1,2,4,2};
		
		// Method 1
		boolean[] b = new boolean[N];
		int repeating = 0;
		for(int i=0;i<N;i++) {
			if(!b[arr[i]-1])
				b[arr[i]-1] = true;
			else {
				repeating =arr[i];
				System.out.println("Repeating element is: "+repeating);
			}
		}
		
		for(int j=0;j<N;j++) {
			if(!b[j])
				System.out.println("Missing element is "+(j+1));
		}
		
		// Method 2
		/*
		 * sum of N s1-> n(n+1)/2 
		 * sum of squares s2-> n(n+1)(2n+1)/6 
		 * N no's -> a,b,c,d given
		 * input might be -> a,c,d,d -> n1 = their sum
		 * sum of square n2 = a,c,d,d -> n2 = their sum of squares
		 * (s1-n1)+(s2-n2) / 2
		 */
		
		long s1 = N*(N+1) / 2;
		long s2 = N*(N+1)*(2*N + 1)/6;
		long n1 = 0;
		for(int a:arr) {
			n1 += a;
		}
		
		long n2=0;
		for(int c: arr) {
			n2 += c*c;
		}
		
		long missing = (s1-n1)+(s2-n2) / 2;
		long repeat = Math.abs(((s1-n1)-(s2-n2)) / 2);
		System.out.println("M:"+missing+"R:"+repeat);
		
		// Method 3
		// Map can be used
		
	}

}
