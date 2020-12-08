package com.coder.pad;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LongestRepeatingCharacter 
{
	static final int NO_OF_CHARS = 256;

	static int count[] = new int[NO_OF_CHARS];

	public static List<Integer> getLongestRepeating(String str)
	{
		ArrayList<Integer> list =  new ArrayList<>();
		int max = Integer.MIN_VALUE;
		
		if (str == null || str.isEmpty())
			return list;

		int size = str.length();
		for (int i = 0; i < size; ++i)
		{
			count[str.charAt(i)]++;
			int v = count[str.charAt(i)];
			if (v > max)
				max = v;
		}
		int index = findIndex(count, max); 
		
		String string = Character.toString((char)index);
		int indexOf = str.indexOf(string);
		list.add(indexOf);
		list.add(max);
		return list;
	}
	public static int findIndex(int[] a, int target)
	{
		return IntStream.range(0, a.length)
						.filter(i -> target == a[i])
						.findFirst()
						.orElse(-1);	// return -1 if target is not found
	}
	public static void main(String args[])
	{
		String str = "a&&&&&&&bbccc";
		System.out.println(getLongestRepeating(str));
	}
}
