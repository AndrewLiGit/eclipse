package com.briup.chap06;

import java.util.ArrayList;
import java.util.List;

public class VarargsTest {
	
	public static double sum(String s,double... para) {
		double result = 0.0;
		for(int i=0;i<para.length;i++) {
			result += para[i];
		}
		return result;
	}
	
	public  static void showList(List... list) {
		for(int i=0;i<list.length;i++) {
			for(Object o:list[i]) {
				System.out.println(o);
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(sum(""));
		System.out.println(sum("a",1.0,2.0));
		System.out.println(sum("b",1.0,2.0,3.0));
		
		
		List list1 = new ArrayList();
		list1.add("list1-string1");
		list1.add("list1-string2");
		list1.add("list1-string3");
		
		List list2 = new ArrayList();
		list2.add("list2-string1");
		list2.add("list2-string2");
		list2.add("list2-string3");
		
		List list3 = new ArrayList();
		list3.add("list3-string1");
		list3.add("list3-string2");
		list3.add("list3-string3");
		
		showList(list1,list2);
		System.out.println("---------");
		showList(list1,list2,list3);
	}
}
