package com.greatlearning.paymoney;

public class PayMoney {
	
	public int checkNumberOfDays(int[] transactions, int target)
	{
		int sumofTransactions=0;
		
		for(int i=0;i<transactions.length;i++)
		{
			sumofTransactions+=transactions[i];
			if(sumofTransactions>=target)
			{
				return (i+1);
			}
		}
		return -1;
		
	}
	
	
	


}
