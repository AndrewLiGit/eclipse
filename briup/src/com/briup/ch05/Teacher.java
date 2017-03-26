package com.briup.ch05;

public class Teacher extends Person{
	private double salary;

	public Teacher(){
		System.out.println("Teacher----");
	}
	public Teacher(String name,int age,boolean gender,double salary){
		super(name,age,gender);
		setSalary(salary);
	}
	public Teacher(double salary){
		this(null,0,false,salary);
	}
	public void setSalary(double salary){
		if(salary<0){
			this.salary=1000;
		}else{
			this.salary=salary;
		}
	}
	public double getSalary(){
		return salary;
	}
	public void display(){
		super.display();
		System.out.println(" salary:"+salary);
	}

}
