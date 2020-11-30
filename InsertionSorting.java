package com.Sorting;

public class InsertionSorting {

	static void InsertionSort(int arr[])
	{
	int Length=arr.length;
	
	for(int i=1; i<Length; ++i)
	{
		int key=arr[i	];
		int j=i-1;
		
		while(j>=0 && arr[j]>key)
		{
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]=key;
		
	}
		
		
	}
	
	
	static void printArray(int arr[])
	{										
		for(int i=0; i<arr.length; ++i)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		int arr[]= {12,11,13,5,6};
		InsertionSorting ob=new InsertionSorting();
		ob.InsertionSort(arr);
		System.out.print("Insertion Sort:-");
		ob.printArray(arr);
	}

}
