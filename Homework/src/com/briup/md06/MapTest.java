package com.briup.md06;

import java.util.*;
import java.util.Map.Entry;
public class MapTest {
	public static void printKey(Map<Integer, String> map){
		Set<Integer> key = map.keySet();
		Iterator<Integer> iter = key.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
	public static void printValue(Map<Integer, String> map){
		Collection<String> c = map.values();
		Iterator<String> iter = c.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
	public static void printEntry(Map<Integer, String> map){
		Set<Entry<Integer, String>> set = map.entrySet();
		Iterator<Entry<Integer, String>> iter = set.iterator();
		while(iter.hasNext()){
			Map.Entry<Integer,String> en = iter.next();
			Integer key = en.getKey();
			String values = en.getValue();
			System.out.println("key:"+key+"  value:"+values);
		}
	}
	public static void main(String args[]){
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "briup1");
		map.put(2, "briup2");
		map.put(3, "briup3");
		printKey(map);
		printValue(map);
		printEntry(map);
	}
}
