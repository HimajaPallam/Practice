package com.hp.techprep;

import java.util.HashMap;
import java.util.Map;

/*Given an integer array nums, determine whether any element appears more than once. Return true if a duplicate exists, and false otherwise.
Example 1:
Input: nums = [1, 1, 2, 3]
Output: true
Example 2:
Input: nums = [1, 2, 3, 4]
Output: false*/

public class DuplicateNumsArrays {
    public static boolean hasDuplicate(int[] nums) {
        // Your code here
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i : nums) {
            if (freqMap.get(i) != null && freqMap.get(i) == 1) {
                return true;
            }
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(hasDuplicate(new int[]{0, 1, 2, 1, 3}));  // [1, 4]
    }
}
