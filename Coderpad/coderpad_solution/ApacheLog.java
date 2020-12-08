package com.coder.pad;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class ApacheLog 
{
	public static void main(String args[])
	{
		String str1 = "10.0.0.1 - frank [10/Oct/2000:13:55:36" + " -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 "
				+ "\"http://www.example.com/start.html\" \"Mozilla/4.08 " + "[en] (Win98; I ;Nav)\"";

		String str2 = "10.0.0.1- frank [10/Oct/2000:13:55" + ":36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 "
				+ "\"http://www.example.com/start.html\" \"Mozilla/4.08 " + "[en] (Win98; I ;Nav)\"";

		String str3 = "10.0.2.1 - frank [10/Oct/2000:13:55" + ":36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 "
				+ "\"http://www.example.com/start.html\" \"Mozilla/4.08 " + "[en] (Win98; I ;Nav)\"";

		String [] arr = {str1, str2, str3}; 

		findTopIPAddress(arr); 
	}

	private static void findTopIPAddress(String[] arr) 
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Integer count = 1;
		for (String str : arr)
		{
			String ip = str.split("-")[0].trim(); 
			if (map.get(ip) != null)
			{
				Integer currCount = map.get(ip);
				currCount += 1;
				map.put(ip, map.get(ip)+1);
			}
			else
			{
				map.put(ip, count);
			}
		}
		Comparator<String> comparator2 = new ValueComparator<String, Integer>(map);
		TreeMap<String, Integer> result2 = new TreeMap<String, Integer>(comparator2);
		result2.putAll(map);
 
		System.out.println(result2.lastKey());
	}
	
}
class ValueComparator<K, V extends Comparable<V>> implements Comparator<K>
{
	HashMap<K, V> map = new HashMap<K, V>();
 
	public ValueComparator(HashMap<K, V> map){
		this.map.putAll(map);
	}
 
	@Override
	public int compare(K s1, K s2) {
		return map.get(s1).compareTo(map.get(s2)); //descending order	
	}
}
