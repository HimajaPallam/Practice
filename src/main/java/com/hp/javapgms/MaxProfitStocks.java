package com.hp.javapgms;

public class MaxProfitStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stocks= {78,85,87,80,65};
		int n = stocks.length;
		int maxRight = stocks[n-1];
		int maxProfit = 0;
		
		for(int i =n-2;i>=0;i--) {
			maxRight = Math.max(maxRight, stocks[i]);
			maxProfit = Math.max(maxProfit, maxRight-stocks[i]);
		}
		
		System.out.println("Max Profit:"+maxProfit);
	}

}
