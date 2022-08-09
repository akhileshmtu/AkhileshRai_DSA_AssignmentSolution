package com.gl.stockers;

public class DescendingShares {
	 public void descendingShares(boolean[] arr)
	    {
	        int count = 0;
	        //increase the count if the value of the arr[i] is false
	        for(int i=0;i<arr.length;i++)
	        {
	            if(arr[i] == false)
	                count++;
	        }
	        //print out the result
	        System.out.println("Total number of companies whose stock price declined today: " + Integer.toString(count));
	    }
}
