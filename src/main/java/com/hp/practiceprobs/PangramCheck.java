package com.hp.practiceprobs;

import java.util.*;

public class PangramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The quick brown fox jumps, over the lazy dog";
		Set<Character> resset = new HashSet<>();
		for(char c: str.toCharArray()) {
			if(c >= 'a' && c <= 'z') {
				resset.add(c);
			} else if(c >= 'A' && c <= 'z') {
				resset.add(Character.toLowerCase(c));
			}
		}
		
		if(resset.size() == 26) {
			System.out.println("Pangram");
		}
	}

}
