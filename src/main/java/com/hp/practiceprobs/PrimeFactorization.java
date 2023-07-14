package com.hp.practiceprobs;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 315025;
		//List<Integer> factor = new ArrayList<>() ;
		for(int i=2;i<Math.sqrt(num);i++) {
			while(num % i == 0) {
				num = num / i;
				System.out.println(i);
			}
		}
		if(num>=2) {
			System.out.println(num);
		}
	}

}
