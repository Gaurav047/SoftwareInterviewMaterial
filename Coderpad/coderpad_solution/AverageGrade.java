package com.coder.pad;

import java.util.*;
import java.util.Map.Entry;

public class AverageGrade {
	public static void main(String[] arg) {
		if(doTestpass()){
			System.out.println("All test passed");
		}
		else{
			System.out.println("Test Failed");
		}
	}
	static boolean doTestpass(){
		String[][] tst= {{"boby","87"},{"charles","100"},{"zac","67"},{"charles","22"}};
		return bestAvgGrade(tst)==87;
	}
	private static Integer bestAvgGrade(String[][] tst) {
		HashMap<String,LinkedList<Integer>> map= new HashMap<>();
		for(int i=0; i<tst.length;i++){
			String[] in= tst[i];
			LinkedList<Integer> val;
			if(map.containsKey(in[0])){
				val= map.get(in[0]);
				val.add(Integer.parseInt(in[1]));
			}
			else{
				val= new LinkedList<>();
				val.add(Integer.parseInt(in[1]));
				map.put(in[0], val);
			}
		}
		// calculate avg for each value in map entry 
		TreeMap<Integer, String> treeMap= new TreeMap<>();
		Set<Entry<String, LinkedList<Integer>>> set= map.entrySet();
		Iterator<Entry<String, LinkedList<Integer>>> it= set.iterator();
		while(it.hasNext())
		{
			Map.Entry<String,LinkedList<Integer>> obj= (Entry<String, LinkedList<Integer>>) it.next();
			String key= obj.getKey();
			LinkedList<Integer> list= obj.getValue();
			Integer sum=0;
			for(int i=0;i<list.size();i++)
			{
				sum+=list.get(i);
			}

			Integer avg= (int) Math.floor((sum/list.size()));

			// put Calculated avg with key in TreeMap for natural sorting
			treeMap.put(avg, key);
		}
		System.out.println("Last "+ treeMap.lastKey());
		System.out.println("First "+ treeMap.firstKey());
		return (Integer) treeMap.lastKey();
	}
}
