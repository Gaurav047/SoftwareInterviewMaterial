package com.coder.pad;

public class SmallestSubArray 
{
	public static int smallestSubWithSum(int arr[], int n, int x)
	{
	    // Initialize current sum and minimum length
	    int curr_sum = 0, min_len = Integer.MAX_VALUE;
	    // Initialize starting and ending indexes
	    int start = 0, end = 0;
	    int startIndex = -1, endIndex = -1;
	    while (end < n)
	    {
	        // Keep adding array elements while current sum
	        // is smaller than x
	        while (curr_sum <= x && end < n)
	        {
	            // Ignore subarrays with negative sum if
	            // x is positive.
	            if (curr_sum <= 0 && x > 0)
	            {
	                start = end;
	                curr_sum = 0;
	            }
	            curr_sum += arr[end++];
	        }
	        // If current sum becomes greater than x.
	        while (curr_sum > x && start < n)
	        {
	            // Update minimum length if needed
	            if (end - start < min_len)
	            {
	            	min_len = end - start;
	            	startIndex = start;
	            	endIndex = min_len;
	            }
	            // remove starting elements
	            curr_sum -= arr[start++];
	        }
	    }
	    for(int i=startIndex;i<=startIndex+endIndex-1;i++) 
	    {
			System.out.print(arr[i] + " " );
		}
	    System.out.println();
	    return min_len;
	}
	public static void main(String args[])
	{
	    int arr[] = {1,2,3,4,5,6,7,8};
	    int x = 26;
	    int n1 = arr.length;
	    int res1 = smallestSubWithSum(arr, n1, x);
	    System.out.println(res1);
	}
}
