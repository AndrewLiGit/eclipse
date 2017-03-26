package com.briup.ch05;

public class ShapeTest{

	public static void draw(Shape shape){
		shape.draw();
	}
	public static void draw(Shape shape,String title){
		shape.draw(title);
	}
	public static void main(String[] args){
		Shape s=new Shape(10,20);
		draw(s);
		draw(s,"shape");
		Shape c=new Circle(20,30,10);
		//Circle c1=(Circle)c;
		//Circle c2=(Circle)s;	
		draw(c);
		draw(c,"circle");

		Rectangle r=new Rectangle(10,20,30,30);
		//Shape r1=r;
		draw(r);
		draw(r,"rectangle");
		
		System.out.println("c instanceof Shape:"+(c instanceof Shape));
		System.out.println("c instanceof Circle:"+(c instanceof Circle));
		System.out.println("c instanceof Rectangle:"+(c instanceof Rectangle));
		System.out.println("s instanceof Shape:"+(s instanceof Shape));
		System.out.println("s instanceof Circle:"+(s instanceof Circle));
	
	}
}
