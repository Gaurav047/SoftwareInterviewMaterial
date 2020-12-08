package com.coder.pad;

public class KthSmallestInRotatedArray 
{
	public static void main(String[] a) {
		int[] inputArr = {2, 3, 4, 5, 6, 7, 8, 1};
		int k = 3;
		System.out.println("kth smallest element is " + kthsmallestElement(inputArr, k));
	}

	public static int kthsmallestElement(int[] input, int k) {

		int smallest = smallestElement(input);
		k = (k < 1 ? 0 : k-1);
		int index= (smallest+k)%input.length;
		return input[index];
	}

	public static int smallestElement(int[] input) {

		int end = input.length - 1;
		int mid = 0;
		int start = 0;
		
		//The minimum element is the only element whose previous is greater than it.
		//If there is no previous element element, then there is no rotation (first element is minimum).
		
		int prev=0; 
		
		while (start <= end) {
			
			mid = (end + start) / 2;
			prev = (mid==0? end:mid-1); // initial condition of previous and for other cases
			
			// checking prev with mid
			if (input[mid] <= input[prev]) 
			{
				return mid;
			}

			// 
			if (input[start] < input[mid] && input[mid]<input[end] || input[start] > input[mid])
			{
				end = mid - 1;
			}
			else  
			{
				start = mid + 1;
			}
		}
		return mid;
	}
}
