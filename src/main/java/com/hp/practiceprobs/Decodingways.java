package com.hp.practiceprobs;

public class Decodingways {
	public static void printAllPossibleCodes(String input, String output) {
	    //Base Case
	   if(input.isEmpty()) {
		   System.out.println(output);
		   return;
	   }
	   // input.charAt(0)-'0' this converts char to integer
	   char c1 = (char) (input.charAt(0)-'0' + 96);
	   int b = input.length()>=2?Integer.parseInt(input.substring(0, 2)):Integer.parseInt(input);
	   printAllPossibleCodes(input.substring(1),output+c1);
	   if(b>=10 && b<27) {
		   char c2 = (char) (b+96);
		   printAllPossibleCodes(input.substring(2),output+c2);
	   }
	        
	}

	public static void printAllPossibleCodes(String input) {
	    String output="";
	    printAllPossibleCodes(input, output);
	    
	}
	
	public static void main(String[] args) {
		String input = "1123";
		printAllPossibleCodes(input);

	}
}
