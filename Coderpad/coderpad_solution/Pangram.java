package com.coder.pad;

import java.util.ArrayList;
import java.util.List;

public class Pangram 
{
	public static List<Character> checkPangram (String str)
	{
		boolean[] mark = new boolean[26];
		char[] arr =  "abcdefghijklmnopqrstuvwxyz".toCharArray(); 

		List<Character> list = new ArrayList<>();
		// For indexing in mark[]
		int index = 0;

		// Traverse all characters
		for (int i = 0; i < str.length(); i++)
		{
			// If uppercase character, subtract 'A'
			// to find index.
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')      
				index = str.charAt(i) - 'A';

			// If lowercase character, subtract 'a'
			// to find index.
			else if('a' <= str.charAt(i) && str.charAt(i) <= 'z')     
				index = str.charAt(i) - 'a';

			// Mark current character
			mark[index] = true;
		}
		// Return false if any character is unmarked
		for (int i = 0; i <= 25; i++)
		{
			if (mark[i] == false)
			{
				list.add(arr[i]);
			}
		}
		return list;
	}
	public static void main(String[] args)
	{
		String str = "The quick brown fox jumps over the dog";

		System.out.println(checkPangram(str));
	}
}
