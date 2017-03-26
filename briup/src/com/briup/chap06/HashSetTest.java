package com.briup.chap06;

import java.util.Set;

import java.util.Iterator;
import java.util.HashSet;
public class HashSetTest {
	public static void show(Set<Student> set){
		Iterator<Student> iter = set.iterator();	
		while(iter.hasNext()) {
			//Object obj = iter.next();
			//Student stu = (Student)obj;
			System.out.println(iter.next());
		}
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}		
	}
	public static void main(String args[]) {
		Set<Student> set = new HashSet<Student>();
		Student stu1 = new Student(1,"tom",20,true);
		Student stu2 = new Student(2,"jack",30,true);
		Student stu3 = new Student(3,"rose",30,false);
		Student stu4 = new Student(1,"tom",20,true);

		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		set.add(stu4);
		System.out.println(set.size());
		show(set);
		System.out.println("----------");
		set.add(stu1);
		set.add(null);
		show(set);
		System.out.println("*********");
		set.remove(stu1);
		show(set);
		set.clear();
		System.out.println("============");
		show(set);
	}
}
