package com.hp.techprep;

/* Given an integer n, count the number of 1 bits in the binary representation of every number in the range [0, n].
Return an array output where output[i] is the number of 1 bits in the binary representation of i.
Example 1:
Input: n = 3
Output: [0,1,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
*/
public class CountingBits {

    public static int[] countBits(int n) {
        // Your code here

        int[] output = new int[n + 1];
        for (int i = 1; i <= n;i++) {
            output[i] = countOnes(i);
        }

        return output;
    }

    private static int countOnes(int num) {
        int count = 0;
        while(num > 0) {
            if(num % 2 == 1) {
                count++;
            }
            num = num / 2;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] output = countBits(5);

        for(int i: output) {
            System.out.println(i);
        }
    }
}
