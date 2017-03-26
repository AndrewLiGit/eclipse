package com.briup.ch05;

public class Student extends Person{

	private int code;


	public Student(){
	//	super();
		this(0,null,false,0);	
	}
	public Student(int code,String name,boolean gender,int age){
		super(name,age,gender);
		setCode(code);
	//	setName(name);
	//	setGender(gender);
		setAge(age);
	//	super(name,age,gender);
	}
	public void display(){
	//	super.display();
		System.out.print("code:"+code);
		super.display();	
		//System.out.println(name+"---------");
	}
	
	public void setCode(int code){
		
		this.code=code;
	}
	public int getCode(){
		return code;
	}
	public void setAge(int age){
		if(age<6||age>30){
			super.setAge(6);
		}else{
			super.setAge(age);
		}

	}

	public void stuTest(){
		System.out.println("in stuTest..");
	}
}
