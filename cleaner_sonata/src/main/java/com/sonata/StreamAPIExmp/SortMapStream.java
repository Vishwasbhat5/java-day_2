package com.sonata.StreamAPIExmp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SortMapStream
{

	public static void main(String[] args)
	
	{
		Map<String,Integer> map =new HashMap<>();
	map.put("eight",8);	
	map.put("four",4);	
	map.put("two",2);	
	map.put("nine",9);
	Set<Map.Entry<String,Integer>> st =map.entrySet();
	
	for(Map.Entry<String,Integer>me:st)
	
	{
		System.out.println(me.getKey()+":");
		System.out.println(me.getValue());
	}
	
	}
}
