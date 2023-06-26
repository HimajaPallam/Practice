package com.hp.javapgms;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagramStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "listen";
		String str2 = "silenp";
		
		if(str1.length() != str2.length()) {
			System.out.print("Given Strings are not Valid Anagrams");
		}
		
		Map<Character, Integer> countFreq = new HashMap<Character, Integer>();
		for(Character s: str1.toCharArray()) {
			if(!countFreq.containsKey(s)) {
				countFreq.put(s, 1);
			} else {
				countFreq.put(s, countFreq.get(s) + 1);
			}
		}
		
		for(Character s: str2.toCharArray()) {
			if(countFreq.containsKey(s)) {
				countFreq.put(s, countFreq.get(s) - 1);
			}
		}
		
		boolean valid = true;
		for(Map.Entry<Character,Integer> entry:countFreq.entrySet()) {
			if(entry.getValue()!=0) {
				valid= false;
			} 
		}
		if(valid) {
			System.out.print("Given Strings Valid Anagrams");
		} else {
			System.out.print("Given Strings not Valid Anagrams");
		}
	}

}
