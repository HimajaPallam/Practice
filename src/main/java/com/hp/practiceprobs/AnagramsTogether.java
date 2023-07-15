package com.hp.practiceprobs;

import java.util.*;

public class AnagramsTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> inlist =List.of("cat", "dog", "tac", "god", "act");
		HashMap<HashMap<Character,Integer>,List<String>> resmap = new HashMap<>();
		
		for(String s:inlist) {
			HashMap<Character,Integer> inthash = new HashMap<>();
			for(int i=0;i<s.length();i++) {
				if(inthash.containsKey(s.charAt(i))) {
					inthash.put(s.charAt(i), inthash.get(s.charAt(i))+1);
				} else {
					inthash.put(s.charAt(i), 1);
				}
			}
			
			if(resmap.containsKey(inthash)) {
				resmap.get(inthash).add(s);
			} else {
				List<String> resList = new ArrayList<String>();
				resList.add(s);
				resmap.put(inthash, resList);
			}
			
		}
		
		for(HashMap<Character,Integer> map: resmap.keySet()) {
			System.out.println(resmap.get(map));
		}
	}

}
