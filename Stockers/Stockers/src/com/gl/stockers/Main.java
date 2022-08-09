package com.gl.stockers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ascending as = new Ascending();
		Descending ds = new Descending();
		DescendingShares dss = new DescendingShares();
		IncreasingShares ins = new IncreasingShares();
		Search sh = new Search();
		
        System.out.println("Enter the number of companies.");
        int n = sc.nextInt();
        
        //array to store the stock price
        double[] companies = new double[n];
        //array to store the info if the shares has increased or decreased
        boolean[] shares = new boolean[n];
        
        //take input
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter current stock price of the company " + Integer.toString(i+1));
            companies[i] = sc.nextDouble();
            System.out.println("Whether the company's stock price rose today compared to yesterday?");
            shares[i] = sc.nextBoolean();
        }
        
        //menu for the user to use
        System.out.println("Enter the operation that you want to perform.");
        System.out.println("1. Display the companies stock prices in ascending order");
        System.out.println("2. Display the companies stock prices in descending order");
        System.out.println("3. Display the total no of companies for which stock prices rose today");
        System.out.println("4. Display the total no of companies for which stock prices declined today");
        System.out.println("5. Search a specific stock price");
        System.out.println("6. press 0 to exit");
        
        int option = -1;
        //break out the loop when the user enters 0
        while(option!=0)
        {
            option = sc.nextInt();
            if(option == 1)
            {
                as.ascending(companies);
            }
            else if(option == 2)
            {
                ds.descending(companies);
            }
            else if(option == 3)
            {
                ins.increasingShares(shares);
            }
            else if(option == 4)
            {
                dss.descendingShares(shares);
            }
            else if(option == 5)
            {
                System.out.println("Enter the key value");
                double key = sc.nextDouble();
                boolean res = sh.search(companies,key);
                if(res == true)
                {
                    System.out.println("Stock value of " + Double.toString(key) + " is present.");
                }
                else{
                    System.out.println("Key value not found");
                }
            }
        }
        System.out.println("Successfully exited");
    }


}
