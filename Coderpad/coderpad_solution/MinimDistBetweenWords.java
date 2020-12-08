package com.coder.pad;

import java.util.ArrayList;
import java.util.List;

public class MinimDistBetweenWords {
	public static void main(String args[]){
		String input = "Java is more compatible and more flexible as compare to .net so there is a longer future";
		String word1 = "more", word2 = "compare";
		
		List<Integer> index1 = findIndexes(input, word1); 
		List<Integer> index2 = findIndexes(input, word2);
		
		System.out.println(index1 + " " + index2);
		System.out.println(compute(input, word1, word2, index1, index2)); 
	}

	private static double compute(String input, String word1, String word2, List<Integer> index1, List<Integer> index2){
		double min = Integer.MAX_VALUE;
		for (Integer i : index1){
			for (Integer j : index2){
				double mid1 = i + word1.length()/2d;
				double mid2 = j + word2.length()/2d;
				double diff = Math.abs(mid1 - mid2); 
				if (diff < min)
					min  = diff;
			}
		}
		return min;
	}
	
	public static List<Integer> findIndexes(String input, String givenWord){
		List<Integer> list = new ArrayList<>();
	    int index = input.indexOf(givenWord);
	    
	    while (index >= 0)
	    {
	        System.out.println("Index : "+index);
	        
	        if (isValidIndexForGivenWord(input, index, givenWord))
	        {
	        	list.add(index);
	        }
	        index = input.indexOf(givenWord, index + givenWord.length());
	    }
	    return list;
	}

	private static boolean isValidIndexForGivenWord(String input, int index, String word) 
	{
		int length = word.length(); 
		if (input.charAt(index + length) == ' ' && input.charAt(index - 1) == ' ')
			return true;
		
		return false;
	}
	 
}


// mukul jangid is a great genius
