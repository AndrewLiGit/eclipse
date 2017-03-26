package com.briup.chap06;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int age;
	private boolean gender;

	public Student(){}
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public Student
		(int id,String name,int age,boolean gender){
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;	
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public boolean getGender() {
		return gender;
	}
	public String toString() {
		return "id:"+id+" name:"+name
				+" age:"+age+" gender:"+gender;
	}
//	public boolean equals(Object o) {
//		System.out.println("this is equals()");
//		if(this == o) return true;
//		Student s = (Student)o;
//		return id==s.id&&name.equals(s.name)
//				&&age==s.age&&gender==s.gender;
//	}
//	public int hashCode() {
//		return id+age;
//	}
	public int compareTo(Student o) {
		System.out.println("this is compareTos");
		//Student s = (Student)o;
		return (this.age-o.age);
	}
}
