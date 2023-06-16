package com.hp.coding;

public class MyTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30; // 1 - 31
        int i[] = {3, 4, 5, 7, 10, 13, 18, 20, 24, 25}; 
        int potserving = 7;
        int cupserving = 3;
        int count = 0;
        int traverseTime = 0;
        int servingTime = 0;
        int refilling = 30;
        int refilTime =0;
        int l = i.length;
        int p=l;
        // If the given array is sorted or else we have to sort before going further
        while(true) {
	        if(p >= 7) {
	        	traverseTime += i[count+(potserving-1)] * 2;	// To and fro from front of plane 
	        	count = count+potserving;
	        	servingTime = count*cupserving; // Cup Serving
	        	refilTime += 1;
	        	p = p-potserving;
	        } else {
	        	traverseTime += i[l-1]* 2;
	        	servingTime += p*cupserving;
	        	break;
	        }
        }
        
        int totalTraverseServTime = traverseTime + servingTime;	// Total traversing and serving time
        
        if(refilTime > 0) {
        	totalTraverseServTime += refilTime * refilling; // Total Refilling Time
        }
        System.out.println("Total time: "+totalTraverseServTime);
	}

}
