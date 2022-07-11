package com.greatlearning.denominations;

public class MergeSort {
	
	public void performMergeSort(int[] inputArray ,int left, int right )
	{
		if(left<right)
		{
		int mid = (left+right)/2;
		performMergeSort(inputArray,left,mid);
		performMergeSort(inputArray,mid+1,right);
		merge(inputArray,left,mid,right);
		}
		
	}
	
	public void merge(int[] inputArray ,int left, int mid , int right )
	{
		//Find size of left and right sub arrays
		int n1 = mid-left+1;
		int n2 = right-mid;
		
		//Declare and populate sub arrays
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			leftArray[i]=inputArray[left+i];
		}
		
		for(int j=0;j<n2;j++)
		{
			rightArray[j]=inputArray[mid+1+j];
		}
		
		
		int i=0,j=0;
		int k=left;
		while ((i<n1) && (j<n2))
		{
			if(leftArray[i]>=rightArray[j])
			{
				inputArray[k]=leftArray[i];
				i++;
			}
			else
			{
				inputArray[k]=rightArray[j];
				j++;
			}
			k++;
				
		}
		
		while(i<n1)
		{
			inputArray[k]=leftArray[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			inputArray[k]=rightArray[j];
			j++;
			k++;
		}
		
		
	}

}
