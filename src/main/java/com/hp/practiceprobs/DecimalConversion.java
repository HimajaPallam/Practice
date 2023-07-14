package com.hp.practiceprobs;

public class DecimalConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Decimal to Binary
		int innum = 59;
		String binstr ="";
		 while(innum>0) {
			 if((innum & 1) == 1) {
				 binstr += '1';
			 } else {
				 binstr += '0';
			 }
			 innum >>= 1;
		 }
		 
		 for(int i=binstr.length()-1;i>=0;i--) {
			 System.out.print(binstr.charAt(i));
		 }
		
		
		// Binary to Decimal - 0101 -> 5
		System.out.println();
		int num = 101011001;
		int base = 1; // binary
		int decimalVal =0;
		
		while(num > 0) {
			int lastDigit = num % 10;
			num = num / 10;
			decimalVal += lastDigit * base;
			base = base * 2;
		}
		System.out.println(decimalVal);
		
		// If the given inputs is string
		String binum = new String("101011001");
		int basenum = 1; // binary
		int decimalValue =0;
		
		for(int i=binum.length()-1;i>=0;i--) {
			if(binum.charAt(i)=='1') {
				decimalValue += basenum;
			}
			basenum *= 2;
		}
		System.out.println(decimalValue);
		
	}

}
