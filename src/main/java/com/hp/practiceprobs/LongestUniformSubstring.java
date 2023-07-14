package com.hp.practiceprobs;

public class LongestUniformSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String instr = "abcdddeftgg";
		int max =Integer.MIN_VALUE;
		char curChar = instr.charAt(0);
		char repchar = curChar;
		int count =1;
		for(int i=1;i<instr.length();i++) {
			char nextChar = instr.charAt(i);
			if(curChar == nextChar) {
				count++;
				if(count > max) {
					max = count;
					repchar = curChar;
				}
				
			} else {
				count=1;
				curChar = nextChar;
			}
		}
		System.out.println(repchar+" occurs "+max+" times");
	}

}
