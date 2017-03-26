package com.briup.ch05;

public class Circle extends Shape{
	private int ran;
	
	public Circle(){}
	public Circle(int x,int y,int ran){
		super(x,y);
		setRan(ran);
	}
	public void draw(){
		super.draw();
		System.out.println("ran:"+ran);
	}
	public void setRan(int ran){
		if(ran<=0){
			this.ran=1;
		}else{
			this.ran=ran;
		}
	}
	public int getRan(){
		return ran;
	}
	public Circle test(){
		Circle c=new Circle();
		return c;
	}
}
