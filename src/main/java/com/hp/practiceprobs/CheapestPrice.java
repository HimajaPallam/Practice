package com.hp.practiceprobs;

import java.util.*;

public class CheapestPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class PriceInterval{
			int startTime;
			int endTime;
			int price;
			PriceInterval(int startTime, int endTime, int price){
				this.startTime=startTime;
				this.endTime = endTime;
				this.price = price;
			}
			
			public String toString() { 
	            return "Start: '" + this.startTime + "', End: '" + this.endTime + "', Price: '" + this.price + "'";
	        } 
		}
		
		List<PriceInterval> input = new ArrayList<PriceInterval>() {
            {
                add(new PriceInterval(0, 4, 5));
                add(new PriceInterval(2, 8, 3));
                add(new PriceInterval(7, 11, 10));
            }
        };
        
        Collections.sort(input, (i,j)->i.startTime-j.startTime);

        for(int i=0;i<=input.size()-2;i++) {
        	if(input.get(i).endTime > input.get(i+1).startTime) {
        		input.get(i).endTime = input.get(i+1).startTime;
        	}
        }
        
        input.forEach(System.out::println);
	}

}
