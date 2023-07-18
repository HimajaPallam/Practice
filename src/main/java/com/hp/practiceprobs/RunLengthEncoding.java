package com.hp.practiceprobs;

public class RunLengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "wwwwaaadexxxxxx";
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s.length();i++) {
			int count = 1;
			
			while(i< s.length()-1 && s.charAt(i) == s.charAt(i+1)) {
				count++;
				i++;
			}
			
			sb.append(s.charAt(i)).append(count);
		}
		
		System.out.println(sb);
	}

}
