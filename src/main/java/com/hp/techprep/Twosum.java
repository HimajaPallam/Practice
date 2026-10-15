package com.hp.techprep;

import java.util.*;

public class Twosum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int j = 0; j < nums.length; j++) {
            int complement = target - nums[j];

            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), j};
            }

            seen.put(nums[j], j);
        }

        throw new IllegalArgumentException("No valid pair found");   // shouldn't happen per problem guarantee
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(twoSum(new int[]{0, -1, 2, -3, -1}, -2)));  // [1, 4]
    }
}
