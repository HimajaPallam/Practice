package com.hp.javapgms;

public class ClimbingStairs {
	/*
	 * You are climbing a staircase. It takes n steps to reach the top.
	 * 
	 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
	 * you climb to the top?
	 */
	public static void main(String[] args) {
		// Given number of stairs
		int n = 7;
		
		// Return n if it is 0 or 1
		if(n <= 1) {
			System.out.println("Number of Stairs:"+n);
		}
		
		int x =1, y = 1;
		int i=2;
		while(i<=n) {
			// Adding last 2 steps because in order to reach a ith step, there is only 1 or 2 steps so previous or previous to previous one
			int temp = x;
			x=y;
			y=temp+x;
			i++;
		}
		System.out.println("Number of Stairs:"+y);
	}

}
