package com.hp.practiceprobs;

public class MergeSort {
	void merge(int arr[], int l, int m, int r)
    {
		int[] resArr = new int[r+1];
		int left = l;
		int right = m+1;
		int i=0;
        while(left <= m && right <= r) {
        	if(arr[left] <= arr[right]) {
        		resArr[i++] = arr[left];
        		left++;
        	} else {
        		resArr[i++] = arr[right];
        		right++;
        	}
        }
        
        while(left <= m) {
        	resArr[i++] = arr[left];
        	left++;
        }
        while(right <= r) {
        	resArr[i++] = arr[right];
        	right++;
        }
        
        for(int j=l;j<=r;j++) {
        	arr[j] = resArr[j-l];
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if(l >= r) return;
        
        int mid = (l+r) / 2;
        sort(arr, l, mid);
        sort(arr, mid+1, r);
        
        merge(arr,l,mid,r);
    }
 
    // A utility function to print array of size n
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
 
        System.out.println("Given array is");
        printArray(arr);
 
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);
 
        System.out.println("\nSorted array is");
        printArray(arr);
    }
}
