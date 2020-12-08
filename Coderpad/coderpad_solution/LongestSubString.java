package com.coder.pad;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString 
{

	static final int NO_OF_CHARS = 256;

	static String longestUniqueSubStr(String str)
	{
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		int maxlen = 0;
		int subStringIndex = 0;

		for (int index = 0; index < arr.length;) {

			int startIndex = index;
			int currLen = 0;

			while (index < arr.length && !map.containsKey(arr[index])) {
				map.put(arr[index], index);
				index++;
				currLen++;
			}

			if (currLen > maxlen) {
				maxlen = currLen;
				subStringIndex = startIndex;
			}

			if(index < arr.length){
				index = map.get(arr[index])+1;
			}

			map.clear();
		}

		System.out.println(subStringIndex + " " + maxlen);
		return str.substring(subStringIndex, subStringIndex + maxlen);}

	public static void main(String args[])
	{
		//aaabcbdeaf, 
		String str = "aaabcbdeaf";
		String string = longestUniqueSubStr(str); 
		System.out.println(string);
	}

}
