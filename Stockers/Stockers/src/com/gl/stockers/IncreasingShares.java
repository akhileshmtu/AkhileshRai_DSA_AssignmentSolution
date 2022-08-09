package com.gl.stockers;

public class IncreasingShares {
	 public void increasingShares(boolean[] arr)
	    {
	        int count = 0;
	        //increase the count if the value of the arr[i] is true
	        for(int i=0;i<arr.length;i++)
	        {
	            if(arr[i] == true)
	                count++;
	        }
	        //print out the result
	        System.out.println("Total number of companies whose stock price rose today: " + Integer.toString(count));
	    }
}
