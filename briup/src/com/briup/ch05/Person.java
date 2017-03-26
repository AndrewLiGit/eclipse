package com.briup.ch05;

public class Person{
	private String name;
	private int age;//attribute
	private	boolean gender;
	public Person(){
		this("unknown",18,true);
	//	this.name="unknown";
	//	this.age=18;
	//	this.gender=true;
		System.out.println("person()");
	}
	public Person(String name,int age,boolean gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public Person(String name){
	//	this.name=name;
	//	this();
		this.name=name;
	//	this.name=name;
	//	this.age=18;
	//	this.gender=true;
	}
	public Person(int age,boolean gender){
		this("unknown",age,gender);
	//	this.name="unknown";
	//	this.age=age;
	//	this.gender=gender;
	}
	public void eat(String name){
		this.name=name;
		System.out.println(name+" eat..");
	}
	public void display(){
	//	System.out.println("person:");
		System.out.println("name:"+name+" age:"+age+" gender:"+(gender?"male":"female"));
	}
	public void display(String name){
		
	}
	public void setAge(int age){
		if(age<0||age>150){
			this.age=10;
		}else{
		this.age=age;
		}
	}
	public int getAge(){
		return age;
	}
	public void setName(String name){// name property
		if(name==null){
			this.name="known";
		}else{
			this.name=name;
		}
	}
	public String  getName(){
		return name;
	}
	public void setGender(boolean gender){
		this.gender = gender;
	}
	public boolean  getGender(){
		return gender;
	}

}
