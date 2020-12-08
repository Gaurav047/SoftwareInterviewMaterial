package com.coder.pad;

public class Atoi 
{
	public static void main(String args[])
	{
		String str = "   ";
		int atoi = atoi(str); 
		System.out.println(atoi);
	}
	private static int atoi(String str) 
	{
		if (str == null || str.isEmpty())
			return 0;
		
		int result = 0;
		int sign = 1;
		int i = 0;
		
		if (str.charAt(0) == '-')
		{
			sign = -1;
			i++;
		}
		for (; i < str.length(); ++i)
		{
			if (isNumeric(str.charAt(i)) == false)
			{
				return 0;
			}
			result = result*10 + str.charAt(i) - '0';
		}
		return sign*result;
	}

	private static boolean isNumeric(char charAt) 
	{
		if (charAt >= '0' && charAt <= '9')
			return true;
		
		return false;
	}
}
