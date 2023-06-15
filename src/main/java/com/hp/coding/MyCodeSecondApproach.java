package com.hp.coding;


/*Task
How much time (in seconds) does it take for a flight attendant to serve coffee?
Write an algorithm (using your choice of Java, Python, Go, or Rust) that finds the amount of time 
needed to serve all passengers if only the passengers in the rows defined in the table [i] (below) 
ordered coffee.
There are n number of rows. 
          int n = 30; // 1 - 31
          int i[] = {3, 4, 5, 7, 10, 13, 18, 20, 24, 25}; // a set of rows where seated passengers want to order coffee

Criteria
There are n passengers on a plane.
There is only one passenger sitting per row.
There are no empty rows. 
The flight attendant carries a coffee pot that can serve 7 passengers and must return to the front
 of the plane to refill the pot in order to serve more.
The flight attendant starts serving passengers from the front of the plane with a full pot of coffee. 
It takes 1 second for the flight attendant to move from one row to another.
It takes 3 seconds for the flight attendant  to fill a cup of coffee.
Refilling the coffee pot takes 30 seconds regardless of how much coffee is added.
After serving all passengers, the flight attendant needs to return to the front of the plane.*/

public class MyCodeSecondApproach {

	public static void main(String[] args) {
		int n = 30; // 1 - 31
        int i[] = {3, 4, 5, 7, 10, 13, 18, 20, 24, 25}; 
		
	      MyCodeSecondApproach mc = new MyCodeSecondApproach();
	      int totaltime = mc.calculateTime(0, i, 0,0,0);
	      System.out.println("Total Time:"+totaltime); 
        
        
	}
	public static int calculateTime(int tempvar, int[] i,int initialserving, int initialTrip, int maxTime) {
		int n = i.length;
		    int count=0;
	        int temp = 0;
	        int refillingCapacity = 30;
	        int coffepotServing = 7; //
	        int servTime = 0;
    	for(int s= tempvar;s<i.length;s++) {
        	maxTime = Math.max(maxTime, i[s]);
        	count++;
        	initialserving = initialserving + 3;
        	if(count == coffepotServing) {
        		initialTrip += Math.max(initialTrip, i[s])*2;
        		initialTrip += refillingCapacity;
        		initialTrip += calculateTime(coffepotServing, i,initialserving,initialTrip,0);
        	}
        	
        	if(n-coffepotServing == count && s==i.length-1) {
        		initialTrip += Math.max(maxTime, i[s])*2;
        	}
        }
    	return initialTrip+initialserving;
    }


}
