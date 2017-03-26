package com.briup.ch05;

public class Shape{
	private int x;
	private int y;
	public Shape(){}
	public Shape(int x,int y){
		setX(x);
		setY(y);
	}
	public void draw(){
		System.out.println("in shape draw()"+"x:"+x+" y:"+y);
	}
	public void draw(String s){
		System.out.println("in shape draw(String) title:"+s+" x:"+x+" y:"+y);
	}
	public void setX(int x){
		if(x<0){
			x=2;
		}else{
			this.x=x;
		}
	}
	public int getX(){
		return x;
	}
	public void setY(int y){
		if(y<0){
			y=2;
		}else{
			this.y=y;
		}
	}
	public int getY(){
		return y;
	}
}
