package com.hp.practiceprobs;

import java.util.Arrays;

/**
 * Array Rotation Problem - Optimized Solutions
 * Rotate an array of n elements to the right by k steps.
 * Example: [1,2,3,4,5,6,7] rotated by 3 → [5,6,7,1,2,3,4]
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] inArray = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println(rotateByLooping(inArray, k));

        int[] arr2 = {1, 2, 3, 4, 5};
        int k2= 12;
        System.out.println(optimizedRotation(arr2, k2));
    }

    private static int[] rotateByLooping(int[] arr, int k) {
       for(int i=0; i<k;i++) {
           for (int j = arr.length - 1; j > 0; j--) {
               int temp = arr[j];
               arr[j] = arr[j - 1];
               arr[j - 1] = temp;
           }
       }
        Arrays.stream(arr).forEach(x -> System.out.print(x));
        return arr;
    }

    private static int[] optimizedRotation(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k==0) {
            return arr;
        }
        int n = arr.length;
        k = k % n; // Handles k > n

        reverse(arr, 0,arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        Arrays.stream(arr).forEach(x -> System.out.print(x));
        return arr;
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
