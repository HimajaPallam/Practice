package com.hp.javapgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		/*
		 * int arr[] =
		 * {135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,
		 * 154,93,183,22,117,119,96,48,127,172,139,70,113,68,100,36,95,104,12,123,134};
		 * int n=42; int s = 468; ArrayList<Integer> numarr = new ArrayList<Integer>();
		 * for(int i=0;i<=n;i++){ int elemsum = arr[i]; for(int j=i+1;j<n;j++){
		 * if(elemsum == s){ numarr.add(i+1); if(i+1 != j){ numarr.add(j); } }
		 * if(elemsum > s || j==n){ break; } elemsum =elemsum+arr[j];
		 * 
		 * } } numarr.add(-1);
		 */
        //return numarr;
		
		// Reversing a String
//		String S = "i.like.this.program.very.much";
//	    String[] splitstr = S.split("\\.");
//        String revStr = "";
//        int n = splitstr.length;
//        if(n>1){
//            for(int i=n-1;i>=0;i--){
//                revStr += splitstr[i]+".";
//            }
//            revStr = revStr.replaceAll("\\.$", "");;
//        }
//        else{
//            revStr = S;
//        }
        
        //Permutations of String in Lexicographic order
		/*
		 * String input = "ABC"; List<String> result = new ArrayList<>();
		 * permutation("", input, result); Collections.sort(result); for (String str :
		 * result) { System.out.println(str); }
		 */
	}
	
	 //Permutations of String in Lexicographic order
//	public static void permutation(String prefix, String suffix, List<String> result) {
//        int n = suffix.length();
//        if (n == 0) {
//            result.add(prefix);
//        } else {
//            for (int i = 0; i < n; i++) {
//                if (i > 0 && suffix.charAt(i) == suffix.charAt(i - 1)) {
//                    continue;
//                }
//                permutation(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i + 1), result);
//            }
//        }
//    }

}
