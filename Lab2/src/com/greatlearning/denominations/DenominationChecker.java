package com.greatlearning.denominations;

public class DenominationChecker {
	
	public void checkDenomination(int[] denomination, int amount)
	{
		int[] denominationCounter=new int[denomination.length];
		
		
		for (int i=0;i<denomination.length;i++)
		{
			if(amount>=denomination[i])
			{
				denominationCounter[i]=amount/denomination[i];
				amount=amount-denomination[i]*denominationCounter[i];
			}
		}
		if(amount>0)
		{
			System.out.println("Exact amounty can not be achieved with highest denomiation approach");
		}
		else
		{
			for (int i=0;i<denominationCounter.length;i++)
			{
				if(denominationCounter[i]!=0)
				{
					System.out.println(denomination[i]+" : "+denominationCounter[i]);
				}
			}
		}
		
		
	}

}
