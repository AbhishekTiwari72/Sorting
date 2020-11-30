package com.Sorting;

public class BubbleSorting {
	
	static void BubbleSort(int arr[])
	{
		int n=arr.length;
		boolean swapped;
		
		for(int i=0; i<n-1; i++)
		{
			swapped=false;
			for(int j=0; j<n-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
		}
		
		
	}
	//PrintArray
	static void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 }; 
		BubbleSort(arr);
		System.out.println("Bubble Sort ");
		printArray(arr);
	}
}
