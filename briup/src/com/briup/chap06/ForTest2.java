package com.briup.chap06;

import java.util.*;
public class ForTest2 {
	public static void main(String args[]) {
		/*
		 *旧式for循环
		 */
		String[] str = 
			new String[]{"briup1","briup2","briup3"};
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		/*
		 *新式for循环
		 */
		for(String s:str) {
			System.out.println(s);
		}
		System.out.println("=========");
		List<String> list = new ArrayList<String>();
		list.add("briup1");
		list.add("briup2");
		list.add("briup3");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

		for(Object s2:list) {
			String str2 = (String)s2;
			//Integer i = (Integer)s2;
			System.out.println(str2);
		}
	}
}






