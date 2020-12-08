package com.coder.pad;

import java.io.*;
import java.util.*;

public class Anagram {
		public static void main(String[] a) throws IOException {
		String [] words = {"cat", "tac", "act", "dog", "god"};
		Map<String, LinkedList<String>> map = new HashMap<String, LinkedList<String>>();
		for (String s : words) {
			String sorted = sort(s);
			if (map.containsKey(sorted)) {
				LinkedList<String> value = map.get(sorted);
				value.add(s);
			} else {
				LinkedList<String> newValue = new LinkedList<String>();
				newValue.add(s);
				map.put(sorted, newValue);
			}
		}
		Set<String> s= map.keySet();
		Iterator<String> it= s.iterator(); 
		while(it.hasNext()){
			Object e= it.next();
			LinkedList<String> ll= map.get(e);
			System.out.println(ll.toString());
		}
	}
	public static String sort(String s){
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}
}
