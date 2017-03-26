package com.briup.chap06;

class Person {
	private String name;
	private int age;

	public Person(){}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//equals
	public boolean equals(Object o) {
		Person p = (Person)o;
		return this.name.equals(p.name) && this.age == p.age;
	}
}
public class EqualsTest {
	public static void main(String args[]) {
		//»º´æ³Ø
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1==s2:"+(s1==s2));
		System.out.println("s1.equals(s2):"+s1.equals(s2));
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println("s3==s4:"+(s3==s4));
		System.out.println("s3.equals(s4):"+s3.equals(s4));
		System.out.println("===========");
		s3 = s3.intern();
		System.out.println("s1==s3:"+(s1==s3));
		System.out.println("s1.equals(s3):"+s1.equals(s3));
	
		Person p1 = new Person("jack",20);
		Person p2 = new Person("jack",20);
		System.out.println("p1==p2:"+(p1==p2));
		System.out.println("p1.equals(p2):"+p1.equals(p2));
	}
}
