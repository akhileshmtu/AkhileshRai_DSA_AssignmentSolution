package com.gl.stockers;

public class Search {
	public boolean search(double[] arr, double x)
    {
        //search the double array to find any value that is equal to the value nextInt
        //return true if found, else return false
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == x)
                return true;
        }
        return false;
    }
}
