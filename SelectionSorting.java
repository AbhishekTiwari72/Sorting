package com.Sorting;

public class SelectionSorting {

	static void SelectionSort(int arr[])
	{
		int n=arr.length;
		for(int i=0; i<n-1; i++)
		{
			int min_index=i;
			for(int j=i+1; j<n; j++)
			{
				//check that if value of j index is less than minimum index.
				if(arr[j]<arr[min_index])
					min_index=j;// assign the new minimum value.
			}		
//***************swap the numbers.********************
				int temp=arr[min_index];
				arr[min_index]=arr[i];
				arr[i]=temp;
			
		}
	}
	
	static void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+"  ");
		System.out.println();
	}
	
	public static void main(String[] args) {

		int arr[]= {64,25,12,22,11};
		SelectionSorting ob=new SelectionSorting();
		ob.SelectionSort(arr);
		System.out.println("Selection Sorting :-");
		ob.printArray(arr);
		
	}

}
