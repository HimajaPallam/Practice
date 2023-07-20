package com.hp.practiceprobs;

public class EggDroppingPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e = 2, f = 10;
		System.out.println(eggDrop(e,f));
	}
	
	private static int eggDrop(int e, int f) {
		if(f == 0 || f == 1) return f;
		if(e == 1) return f;
				
		int mn = Integer.MAX_VALUE;
		for(int k=1;k<=f;k++) {
			int temp = 1+Math.max(eggDrop(e-1,k-1), eggDrop(e,f-k));
			mn = Math.min(temp, mn);
		}
		
		return mn;
	}

}
