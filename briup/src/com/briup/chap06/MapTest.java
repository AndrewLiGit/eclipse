package com.briup.chap06;

import java.util.*;
import java.util.Map.*;
public class MapTest {
	public static void printKey(Map<Integer, String> map) {
		Set<Integer> keys = map.keySet();
		Iterator<Integer> iter = keys.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	public static void printValue(Map<Integer, String> map) {
		Collection<String> c = map.values();
		Iterator<String> iter = c.iterator();
		for(;iter.hasNext();){
			System.out.println(iter.next());
		}
	}
	public static void printKandV(Map<Integer, String> map) {
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		Iterator<Map.Entry<Integer, String>> iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<Integer,String> en = iter.next();
			Object key = en.getKey();
			Object value = en.getValue();
			System.out.println("key:"+key+" value:"+value);
		}
	}
	public static void main(String args[]) {
		Map<Integer, String> map  =  new HashMap<Integer, String>();
		map.put(1,"tom");
		map.put(3,"jack");
		map.put(2,"rose");
		map.put(1,"jack");
		printKey(map);
		printValue(map);
		printKandV(map);
	}
}
