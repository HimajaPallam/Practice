package com.hp.practiceprobs;

import java.util.*;

public class FirstNonRepeatedChar {

	class Countindex{
		int count;
		int index;
		Countindex(int index){
			this.count=1;
			this.index = index;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Method 1
		FirstNonRepeatedChar fc = new FirstNonRepeatedChar();
		String instr = "GeeksforGeeks";
		Map<Character,Countindex> map = new HashMap<>();
		for(char c: instr.toCharArray()) {
			if(map.containsKey(c)) {
				map.get(c).count += 1;
			} else {
				map.put(c, fc.new Countindex(instr.indexOf(c)));
			}
		}
		int resIndex = Integer.MAX_VALUE;
		for(Map.Entry<Character, Countindex> em: map.entrySet()) {
			if(em.getValue().count == 1) {
				if(resIndex > em.getValue().index) {
					resIndex = em.getValue().index;
				}
			}
		}
		System.out.println(instr.charAt(resIndex));
		
		
		
		
		// Method 2
		for(char c:instr.toCharArray()) {
			if(instr.indexOf(c) == instr.lastIndexOf(c)) {
				System.out.println(c);
				break;
			}
		}

	}

}
