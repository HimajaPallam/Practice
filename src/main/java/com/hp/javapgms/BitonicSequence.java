package com.hp.javapgms;

public class BitonicSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 11, 2, 10, 4, 5, 2, 1};
//		if(arr.length < 3){
//	        System.out.println("invalid");
//	    }
//		 int max = 0;
//	        for(int i = 1; i < arr.length-1; i++) {
//	            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
//	                int left = i-1;
//	                int right = i+1;
//	                
//	                while(left > 0 && arr[left-1] < arr[left]) left--;
//	                while(right < arr.length-1 && arr[right] > arr[right+1]) right++;
//	                
//	                max = Math.max(max, right-left+1);
//	            }
//	        }
//	        
//	    System.out.println("valid:"+max);
		
		
		int n= nums.length;
		int[] lis = new int[n]; 
		int[] lds = new int[n];
	    for(int i=0;i<n;i++)
	    {
	        lis[i] = 1;
	        for(int j=0;j<i;j++)
	        {
	            if(nums[i] > nums[j] && lis[i] < lis[j] + 1)
	                lis[i] = lis[j] + 1;
	        }
	    }
	    
	    for(int i=n-1;i>=0;i--)
	    {
	        lds[i] = 1;
	        for(int j=n-1;j>i;j--)
	        {
	            if(nums[i] > nums[j] && lds[i] < lds[j] + 1)
	                lds[i] = lds[j] + 1;
	        }
	    }
	   
	    int max_len = 0;
	    for(int i=0;i<n;i++)
	    {
	        max_len = Math.max(max_len, lis[i] + lds[i] - 1);
	    }
	    
	    System.out.println("valid:"+max_len);
	}


}
