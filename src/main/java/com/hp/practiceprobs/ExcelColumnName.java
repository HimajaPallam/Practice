package com.hp.practiceprobs;

public class ExcelColumnName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 52;
		StringBuilder columnName = new StringBuilder();

		while(num > 0) {
			int rem = num % 26;
			if(rem == 0) {
				columnName.append("Z");
				num = num/26 - 1;
			} else {
				columnName.append((char)((rem-1)+'A'));
				num = num/26;
			}
		}
		
		System.out.println(columnName.reverse());
	}

}
