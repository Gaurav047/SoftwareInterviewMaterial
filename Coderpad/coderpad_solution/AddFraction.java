package com.coder.pad;

public class AddFraction 
{
	public static int gcd(int a, int b)
	{
		if (a == 0)
			return b;
		return gcd(b%a, a);
	}
	public static int[] lowest(int den3, int num3)
	{
		int[] res = new int[2];
		// Finding gcd of both terms
		int common_factor = gcd(num3,den3);

		// Converting both terms into simpler 
		// terms by dividing them by common factor 
		den3 = den3/common_factor;
		num3 = num3/common_factor;
		res[0] = num3;
		res[1] = den3;
		return res;
	}
	public static void addFraction(int[] frac1, int[] frac2)
	{
		int num1 = frac1[0], num2 = frac2[0];
		int den1 = frac1[1], den2 = frac2[1];
		int num3, den3;
		// Finding gcd of den1 and den2
		den3 = gcd(den1,den2);

		// Denominator of final fraction obtained
		// finding LCM of den1 and den2
		// LCM * GCD = a * b 
		den3 = (den1*den2) / den3;

		// Changing the fractions to have same denominator
		// Numerator of the final fraction obtained
		num3 = (num1)*(den3/den1) + (num2)*(den3/den2);

		// Calling function to convert final fraction
		// into it's simplest form
		int[] arr = lowest(den3,num3);
		System.out.println(arr[0] + " " + arr[1]); 
	}
	public static void main(String args[])
	{
	    int [][] frac = {{2, 5}, {3, 6}};
	    addFraction(frac[0], frac[1]);
	}
}
