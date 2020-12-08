package com.coder.pad;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BiggestNumber 
{
	public static void main(String args[])
	{
		Integer arr[] = {1, 34, 3, 98, 9, 76, 45, 4}; //998764543431
		printLargest(arr);
	}

	private static void printLargest(Integer[] arr) 
	{
		List<String> list = Arrays.stream(arr).map(String::valueOf).collect(Collectors.toList());	//toArray(String[]::new); 
		//List<String> list = Arrays.asList(strings);  
		Collections.sort(list, new Comparator<String>()
		{
			@Override
			public int compare(String x, String y) 
			{
				String xy = x + y;
				String yx = y + x;
				
				return xy.compareTo(yx) > 0 ? -1 : 1;
			}
		});
		list.forEach(System.out::print); 
	}
}
