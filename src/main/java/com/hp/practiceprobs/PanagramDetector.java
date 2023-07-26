package com.hp.practiceprobs;

import java.io.*;
import java.util.*;

public class PanagramDetector {
	
  private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
  
  public static String findMissingLetters(String sentence) {
	    char[] inchar = sentence.toCharArray();
	    char[] com = ALPHABET.toCharArray();
	    
	    if(sentence.length() == 0){
	      return ALPHABET;
	    }
	    
	    Set<Character> set = new HashSet<Character>();
	    for(int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z'){
                set.add(c);
            }
            else if (c >= 'A' && c <= 'Z'){
                set.add(Character.toLowerCase(c));
            }
        }
	    StringBuilder resString = new StringBuilder();
        for(char cp:com){
            if(!set.contains(cp)){
            	resString.append(cp);
            }
        }
	    
	    return resString.toString();
	  }
  
  public static void main(String[] args) {
	  boolean success = true;
		
	  success = success && "".equals(findMissingLetters("Thequickbrownfoxjumpsoverthelazydog"));
	  success = success && "bfgjkvz".equals(findMissingLetters("The slow purple oryx meanders past the quiescent canine"));
	  success = success && "cdfjklmopqruvxyz".equals(findMissingLetters("We hates Bagginses!"));
	  success = success && "abcdefghijklmnopqrstuvwxyz".equals(findMissingLetters(""));
	
	  if (success) {
	    System.out.println("All tests passed.");
	  } else {
	    System.out.println("At least one of your tests failed.");
	  }
	  }
	 
	  
}
