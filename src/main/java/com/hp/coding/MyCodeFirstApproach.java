package com.hp.coding;

public class MyCodeFirstApproach {

	public static void main(String[] args) {
		int n = 30; // 1 - 31
        int i[] = {3, 4, 5, 7, 10, 13, 18, 20, 24, 25}; 
        
		// TODO Auto-generated method stub
		int coffepotServing = 7; // coffee pot serving
        int coffefilling = 3; //coffee filling
        
        
        //if(i.length > coffepotServing) {
	        //Initial trip from front to 7 rows
	        int initialtrip = i[coffepotServing-1];
	        int initialserving = coffepotServing * 3;
	        
	        //Trip to FrontPlane
	        initialtrip =  initialtrip+i[coffepotServing-1] + 30;
	        
	        //Trip to remaining passengers
	        int maxTime = 0;
	        for(int s= coffepotServing;s<i.length;s++) {
	        	maxTime = Math.max(maxTime, i[s]);
	        	initialserving = initialserving + 3;
	        }
	        
	        initialtrip = initialtrip + maxTime;
	        
	       //Trip to front of plane - maxTime
	        initialtrip = initialtrip + maxTime;
	        
	        int totalTime = initialtrip+initialserving;
	        System.out.println("Total Time:"+totalTime);
        //} 
	}

}
