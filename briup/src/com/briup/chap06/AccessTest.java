package com.briup.chap06;

import com.briup.ch05.Person1;
class Employee extends Person1 {
	public Employee() {
	 	super.setName("jack");
		super.setId(10);
		super.age = 20;
		super.gender = "male";
		//super("jack",10,20,"male");
	}
}
public class AccessTest {
	public static void main(String args[]) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		System.out.println("e1 == e2:"+(e1 == e2));
		System.out.println("e1.equals(e2):"+e1.equals(e2));
		System.out.println("e1:"+e1.toString());
		System.out.println("e2:"+e2.toString());
	}
}
