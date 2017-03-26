package com.briup.ch05;

public class Rectangle extends Shape{

	private int width;
	private int height;

	public Rectangle(){}
	public Rectangle(int x,int y,int width,int height){
		super(x,y);
		this.width=width;
		this.height=height;
	}
	public void draw(String s){
		super.draw(s);
		System.out.println(" width:"+width+" height:"+height);
	}
}
