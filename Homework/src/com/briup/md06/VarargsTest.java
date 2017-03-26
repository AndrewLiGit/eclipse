package com.briup.md06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VarargsTest {
	public static void main(String args[]){
		ArrayList<Integer> intList = new ArrayList<Integer>();
		Vector<String> strList = new Vector<String>();
		LinkedList<Student> eList = new LinkedList<Student>();
		
		for(int i=1;i<=5;i++){
			intList.add(i);
			strList.add("briup"+i);
			eList.add(new Student("tom"+i,20+i,56+i,34+i,67+i));
		}
		printList(intList,strList,eList);
	}
	public static void printList(List<?> ... lists){
		for(List<?> list:lists){
			Iterator<?> it = list.iterator();
			while(it.hasNext()){
				//Object o = it.next();
				System.out.println(it.next());
			}
		}
	}
}
