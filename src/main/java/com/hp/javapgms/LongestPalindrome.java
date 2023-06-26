package com.hp.javapgms;

// We may get odd length palindrome or even length also
/*Example 1:

Input: s = "babad" --------------------> odd
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd" -----------------------> even
Output: "bb"*/
public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String instr = "babab";
		char[] str = instr.toCharArray();
		int maxlength = 0;
		int start=0;
		
		for(int i=1;i< instr.length();i++) {
			
			// For Even Palindrome
			int left = i-1;
			int right = i;
			
			while(left>=0 && right<instr.length() && instr.charAt(left)==instr.charAt(right)) {
				// max length is right-left+1
				if(right-left+1>maxlength) {
					maxlength = right-left+2;
					start = left;
				}
				left -= 1;
				right += 1;
			}
			
			// For Odd Palindrome
			left = i-1;
			right = i+1;
			while(left>=0 && right<instr.length() && instr.charAt(left)==instr.charAt(right)) {
				// max length is right-left+1
				if(right-left+1>maxlength) {
					maxlength = right-left+1;
					start = left;
				}
				left -= 1;
				right += 1;
			}
		}
		
		//start will contain start position of palindrome and length will be maintained in maxlength
		System.out.print("Longest Palindrome:"+instr.substring(start,maxlength));
		
	}

}
