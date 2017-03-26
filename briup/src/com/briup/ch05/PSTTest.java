package com.briup.ch05;
public class PSTTest{

	public static void main(String[] args){
		System.out.println("----person----");
		Person p=new Person();
		p.display();
		p.eat("per");	
		System.out.println("------Student---");
		p=new Student();
		p.display();
//		p.eat("stu");
		//p.stuTest();
		System.out.println("-----teacher---");
		Person t=new Teacher();
		t.setName("mary");
		t.setAge(20);
		t.display();
		t.eat("tea");
		
	}
}
