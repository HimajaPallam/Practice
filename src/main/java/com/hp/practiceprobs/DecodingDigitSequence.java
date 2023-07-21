package com.hp.practiceprobs;

public class DecodingDigitSequence {

	public static int numDecodings(String s) {
        int[] f = new int[s.length() + 1];
        f[0] = 1;
        int last = 0, last2 = 0;
        for (int i = 0; i < s.length(); i ++) {
            last  = s.charAt(i) - '0';
            last2 = last2 % 10 * 10 + last;
            if (last > 0) f[i + 1] = f[i];
            if (last2 > 9 && last2 < 27)
                f[i + 1] += f[i - 1];
        }
        return f[s.length()];
    }
 
    public static void main(String[] args)
    {
        String input = "1123";
        System.out.println(numDecodings(input));
    }
}
