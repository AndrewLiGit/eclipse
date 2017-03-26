package com.briup.chap06;

import java.util.*;
public class LinkedListTest {
	public static void show(List<Student> list) {
		Iterator<Student> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	public static void main(String args[]){
		LinkedList<Student> list = new LinkedList<Student>();
		Student stu1 = new Student("tom",20);
		Student stu2 = new Student("jack",20);
		Student stu3 = new Student("rose",30);
		Student stu4 = new Student("tom",20);

		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		System.out.println(list.size());
		show(list);
		System.out.println("==========");
		list.addFirst(stu3);
		list.addLast(stu2);
		show(list);
		System.out.println("*********");
		list.removeFirst();
		list.removeLast();
		show(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}
}
