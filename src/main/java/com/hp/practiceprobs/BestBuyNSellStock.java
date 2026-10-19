package com.hp.practiceprobs;

public class BestBuyNSellStock {


	public static int maxProfit(int[] prices) {

		int i = 0;
		int j = 1;
		int maxProfit = 0;
		while (i < prices.length - 1 && j < prices.length) {
			if (prices[i] > prices[j]) {
				i++;
				j = i + 1;

			} else {
				int profit = prices[j] - prices[i];
				maxProfit = Math.max(maxProfit, profit);
				j++;
			}
		}
		return maxProfit;
		// your code here
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {8, 2, 5, 4, 11, 1};
		System.out.println(maxProfit(prices));
	}

}
