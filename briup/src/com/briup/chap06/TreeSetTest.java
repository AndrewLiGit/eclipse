package com.briup.chap06;

import java.util.*;

public class TreeSetTest {
	public static void show(Set<Student> set) {
		
		Iterator<Student> iter = set.iterator();
		for(;iter.hasNext();) {
			Object obj = iter.next();
			Student stu = (Student)obj;
			System.out.println(stu);
		}
	}
	public static void main(String args[]) {
		Set<Student> set = new TreeSet<Student>();
		Student stu1 = new Student(1,"tom",20,true);
		Student stu2 = new Student(2,"jack",30,true);
		Student stu3 = new Student(3,"rose",25,false);
		Student stu4 = new Student(4,"rose",20,false);
//		Set set = new TreeSet(new Comparator(){
//			public int compare(Object o1,Object o2) {
//				Student s1 = (Student)o1;
//				Student s2 = (Student)o2;
//				return s1.getAge()-s2.getAge();
//			}		
//		}); 
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		set.add(stu4);
		//set.add(null);
		System.out.println(set.size());
		show(set);
//		System.out.println("-----------");
//		set.clear();
//		show(set);
	}
}
