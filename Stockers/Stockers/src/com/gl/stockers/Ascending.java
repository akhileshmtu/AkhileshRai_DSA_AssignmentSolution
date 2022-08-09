package com.gl.stockers;

import java.util.Arrays;

public class Ascending {
	 public void ascending(double[] arr)
	    {
	        int n = arr.length;
	        //copying the elements to a different array, so that the order of the original array remains same
	        double[] temp = new double[n];
	        for(int i=0;i<n;i++)
	        {
	            temp[i] = arr[i];
	        }
	        //using the inbuilt sort function to sort the array. It uses quick sort, so the time complexity will be O(nlogn).
	        Arrays.sort(temp);
	        
	        //print out the sorted array
	        System.out.println("Stock prices in ascending order are:");
	        for(int i=0;i<n;i++)
	            System.out.print(Double.toString(temp[i]) + " ");
	        System.out.println();
	    }
	
}
