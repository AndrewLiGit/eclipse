package com.briup.chap06;

import java.util.*;
public class ForTest {
	public static void main(String args[]) {
		String[] str = new String[]{"briup1","briup2","briup3"};
		/*
		 *旧式for循环
		 */
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		System.out.println("-----------");
		/*
		 *增强for循环
		 */
		for(String s:str) {
			System.out.println(s);
		}
		List<String> list = new ArrayList<String>();
		list.add("str1");
		list.add("str2");
		list.add("str3");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------");

		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("---------");

		for(Object o:list) {
			String s = (String)o;
			System.out.println(s);
		}
	}
}
