package com.briup.ch05;

public class Person1 {
	private String name;
	int id;
	protected int age;
	public String gender;

	public Person1(){}
	public Person1(String name,int id,
						int age,String gender){
			this.name = name;
			this.id = id;
			this.age = age;
			this.gender = gender;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	//toString()
	public String toString() {
		return "name:"+name+" id:"+id
				+" age:"+age+" gender:"+gender;
	}
}
