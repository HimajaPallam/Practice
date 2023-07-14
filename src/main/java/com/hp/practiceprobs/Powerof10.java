package com.hp.practiceprobs;

public class Powerof10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Method 1
		int n = -10;
		
		// if negative number is given
		n = Math.abs(n);
		// or 
		// n = n * (-1);
		
			int len = Integer.toString(n).length();
			
			if(Math.pow(10, len-1)==n) {
				System.out.println("Power of 10");
			}
			
		
			
		// Method 2
			while(n % 10 == 0 && n >=10) {
				n = n/10;
			}
			if(n == 1) {
				System.out.println("Power of 10");
			}
	}
}
