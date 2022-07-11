package com.greatlearning.denominations;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of denominations");
		int noOfDenominations=sc.nextInt();
		
		int[] denominations = new int[noOfDenominations];
		System.out.println("Please enter denominations");
		
		for (int i=0;i<denominations.length;i++)
		{
			denominations[i]=sc.nextInt();
		}
		System.out.println("Denominations are as follows");
		displayDenomination(denominations);
		
		System.out.println("Enter the amount");
		int targetAmount=sc.nextInt();
		
		MergeSort ms = new MergeSort();
		ms.performMergeSort(denominations, 0, denominations.length-1);
		
		System.out.println("Denominations after sorting are as follows");
		displayDenomination(denominations);
		
		
		DenominationChecker dc = new DenominationChecker();
		dc.checkDenomination(denominations, targetAmount);
				

	}
	
	public static void displayDenomination(int[] denomination)
	{
		for (int denom : denomination)
		System.out.print(denom+" ");
		System.out.println("");
	}

}
