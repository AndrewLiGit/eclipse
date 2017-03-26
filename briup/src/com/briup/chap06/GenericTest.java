package com.briup.chap06;

public class GenericTest<T> {
	private T[] stu; //T[]  ==  Student[]

	public void setStu(T[] stu) {
		this.stu = stu;
	}
	public T[] getStu() {
		return stu;
	}
	public static void main(String args[]) {
		Student[] stu = new Student[3];
		stu[0] = new Student("tom",20);
		stu[1] = new Student("jack",20);
		stu[2] = new Student("rose",20);

		GenericTest<Student> gt = 
			new GenericTest<Student>();
		gt.setStu(stu);
		System.out.println(gt.getStu());
		for(Student s:stu) {
			System.out.println(s);
		}	
	}
}
