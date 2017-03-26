package com.briup.chap06;

public class GenericsCircle<T> {
	private T radius;

	public void setRadius(T radius) {
		this.radius = radius;
	}
	public T getRadius() {
		return radius;
	}
	public static void main(String args[]) {
		GenericsCircle<String> gc =  
			new GenericsCircle<String>();
		gc.setRadius("10");
		//String str = gc.getRadius();
		System.out.println(gc.getRadius());
	}
}
