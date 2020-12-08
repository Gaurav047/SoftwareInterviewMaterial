package com.coder.pad;

public class PowerOfTen 
{
	public static void main(String args[])
	{	
		long num = 1000000;
		boolean checkPowerOfTen = checkPowerOfTen(num); 
		System.out.println(checkPowerOfTen);
	}

	private static boolean checkPowerOfTen(long input) 
	{
		while (input > 9 && input % 10 == 0) 
			  input /= 10;
		
			return input == 1;
	}
}
