package com.briup.chap06;

public class SwitchEnum {
	
	public static String doOp(int i) {
		switch(i) {
			case 0:
				return "向右转";
			case 1:
				return "向左转";
			default:
				return "射击";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(doOp(OpConstant.TURN_LEFT.getValue()));
		System.out.println(doOp(OpConstant.TURN_RIGHT.getValue()));
		System.out.println(doOp(OpConstant.SHOOT.getValue()));
	}
}

enum OpConstant {
	TURN_LEFT(1),TURN_RIGHT(0),SHOOT(2);
	
	private int value;
	OpConstant(int value) {
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
	
}
