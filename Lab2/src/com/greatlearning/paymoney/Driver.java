package com.greatlearning.paymoney;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the transaction array, i.e Number of days for which you need to track transactions");
		int trasactionSize=sc.nextInt();
		
		int[] transactions = new int[trasactionSize];
		
		for (int i=0;i<trasactionSize;i++)
		{
			System.out.println("Enter the daily transaction for day "+(i+1)+" in crores");
			transactions[i]=sc.nextInt();
		}
		
		System.out.println("Entered values are below");
		displayTransactions(transactions);
		
		System.out.println("Enter the target amount in crores you want to achieve");
		int dailyTarget = sc.nextInt();
		PayMoney pm = new PayMoney();
		int noOfDays= pm.checkNumberOfDays(transactions, dailyTarget);
		if(noOfDays==-1)
		{
			System.out.println("Target not achieved");
		}
		else
		{
			System.out.println("Target achieved in "+noOfDays+" days");
		}
		
		
		
		sc.close();
		
	}
	
	
	public static void displayTransactions(int[] transactions)
	{
		
		for (int transaction : transactions )
		{
			System.out.print(transaction+" ");
		}
		System.out.println("");
		
	}

}
