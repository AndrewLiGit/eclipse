package com.briup.md06;

import java.util.*;

class Employee{
	private String name;
	private int age;
	private int id;
	private boolean gender;
	
	public Employee(String name, int age, int id, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean getGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", id=" + id
				+ ", gender=" + (gender?"male":"famale" )+ "]";
	}

}
public class HashTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Employee> map1 = new HashMap<Integer,Employee>();
		Employee p1 = new Employee("Tom",20,1,true);
		Map<Integer,Employee> map2 = new HashMap<Integer,Employee>();
		Employee p2 = new Employee("jack",23,2,false);
		map1.put(1,p1);
		map2.put(2,p2);
		
		System.out.println(map1.get(1));
		System.out.println(map2.get(2));
	}

}
