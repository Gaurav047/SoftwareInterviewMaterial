package com.coder.pad;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestWordInDict 
{
	public static void main(String args[])
	{
		String [] dict = {"to","toe","toes","doe","dog","god","dogs","book","banana"};
		String input = "dsetog"; 
		System.out.println(findLongestString(dict, input));
	}

	public static List<String> findLongestString(String [] dict, String str)
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		int max = 0;
		for (String s : dict) 
		{
			if (isPresent(str, s)) {
				if (s.length() > max) {
					max = s.length();
				}
				map.put(s, s.length());
			}
		}
		System.out.println(map);
		int count = max;
		List<String> r =
				map.entrySet().stream().filter(m -> m.getValue() == count).map(m -> m.getKey())
				.collect(Collectors.toList()); 
		return r;
	}

	private static boolean isPresent(String input, String s) {

		for (char c : s.toCharArray()) {
			if (input.indexOf(c) == -1)
				return false;
		}
		return true;
	} 
}
