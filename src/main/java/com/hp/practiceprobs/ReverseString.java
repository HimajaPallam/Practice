package com.hp.practiceprobs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String instr = "Fluke";
		
		//Method1
		char[] revstr = instr.toCharArray();
		for(int i=0,j=instr.length()-1;i<=j;i++,j--) {
			char temp = revstr[i];
			revstr[i] = revstr[j];
			revstr[j] = temp;
		}
		
		//Method2
		StringBuilder sb = new StringBuilder();
		for(int i=instr.length()-1;i>=0;i--) {
			sb.append(instr.charAt(i));
			
		}
		
		//Method 3
		StringBuilder revsb = new StringBuilder(instr);
		revsb.reverse();
		
		System.out.println(revsb);
	}

}
