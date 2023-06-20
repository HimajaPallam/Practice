package com.hp.javapgms;

public class BinaryNumberAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "011011", y = "1010111";
		
		int num1 = Integer.parseInt(x,2);
		int num2 = Integer.parseInt(y,2);
		
		System.out.println("Binary Addition:" +Integer.toBinaryString(num1+num2));
	}

}
