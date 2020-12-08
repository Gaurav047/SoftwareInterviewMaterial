package com.coder.pad;

public class StairCase 
{
	public static int fib(int n)
	{
		if (n <= 1)
			return n;
		return fib(n-1) + fib(n-2);
	}
	
	// Generalized
	// A recursive function used by countWays
    static int countWaysUtil(int n, int m)
    {
        if (n <= 1)
            return n;
        int res = 0;
        for (int i = 1; i<=m && i<=n; i++)
            res += countWaysUtil(n-i, m);
        return res;
    }
  
    // Returns number of ways to reach s'th stair
    static int countWays(int s, int m)
    {
        return countWaysUtil(s+1, m);
    }
 
	// Returns number of ways to reach s'th stair
	public static int countWays(int s)
	{
		return fib(s + 1);
	}

	/* Driver program to test above function */
	public static void main (String args[])
	{
		int s = 4;
		System.out.println("Number of ways = "+ countWays(s));
	}
}
