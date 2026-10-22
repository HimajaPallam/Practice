package com.hp.practiceprobs;

import java.util.HashMap;
import java.util.Map;



/*Write a program to determine the length of the longest substring without repeating characters, given a string s.
Example 1:
Input: s = "xyxyxz"
Output: 3
Explanation: The answer is "yxz", with a length of 3.
Example 2:
Input: s = "aaaaa"
Output: 1
Explanation: The answer is "a", with a length of 1.*/

public class LongestNonRepeastingSubstring {
    public static int lengthOfLongestSubstring(String s) {
        // Your code here
        Map<Character, Integer> lastIndex = new HashMap<>();
        int i = 0;
        int maxLength = 0;

        for(int j=0; j<s.length(); j++){
            char c = s.charAt(j);
            if(lastIndex.containsKey(c) && lastIndex.get(c) >= i) {
                i = lastIndex.get(c) + 1;
            }

            lastIndex.put(c, j);
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "ABABAB";
        int k =2;
        System.out.println(lengthOfLongestSubstring(s));
    }
}
