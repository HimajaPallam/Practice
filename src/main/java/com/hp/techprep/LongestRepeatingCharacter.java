package com.hp.techprep;

import java.util.HashMap;
import java.util.Map;


/*You are given a string s consisting of uppercase English letters and an integer k. You can change any character in the string to any other uppercase letter, but you are allowed to make at most k changes.
Your task is to return the length of the longest substring that contains the same letter after making at most k changes.

Example 1:
Input: s = "ABABAB", k = 2
Output: 5
Explanation:
By changing two of the 'B's in the first five characters to 'A's,
the substring "ABABA" can become "AAAAA",
and the longest substring with repeating characters will be 5.
*/


public class LongestRepeatingCharacter {


    public static int characterReplacement(String s, int k) {
        // Your code here

        Map<Character, Integer> charMap = new HashMap<>();

        for(char c: s.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        // this is the edge case i missed thinking about - if the string contains like "AAAAA", then whatever
        // may be the k value tha max char repeating is length of the string itself.
        if(charMap.size() == 1) {
            return s.length();
        }

        int maxFreq = charMap.values().stream().max(Integer::compareTo).get();
        return maxFreq + k;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "ABABAB";
        int k =2;
        System.out.println(characterReplacement(s,k));
    }
}
