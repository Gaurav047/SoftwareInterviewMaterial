package com.coder.pad;

public class ReverseString 
{
	public static void main(String args[])
	{
		String str = "geeks for geeks";
		String reverseString = reverseStringRecursivley(str); 
		
		System.out.println(reverseString);
	}

	private static String reverseStringRecursivley(String str) 
	{
		if (str == null || str.isEmpty())
		{
			return str;
		}
		
		int length = str.length();
		if (length == 1)
			return str;
		
		return reverseStringRecursivley(str.substring(1)) + str.charAt(0);
	}
}
