package com.briup.chap06;

public enum AbstractEnum {
	ADD{
		public double calculate(double d1,double d2) {
			return d1+d2;
		}
		public String getInfo() {
			return "add";
		}
	},
	SUB{
		public double calculate(double d1,double d2) {
			return d1-d2;
		}
		public String getInfo() {
			return "sub";
		}
	},
	MUL{
		public double calculate(double d1,double d2) {
			return d1*d2;
		}
		public String getInfo() {
			return "mul";
		}
	},
	DIV{
		public double calculate(double d1,double d2) {
			return d1/d2;
		}
		public String getInfo() {
			return "div";	
		}
	};
	public abstract double calculate(double d1,double d2);
	public abstract String getInfo();
	public static void main(String args[]) {
		AbstractEnum add = AbstractEnum.ADD;
		System.out.println(add);
		System.out.println(add.toString());
		System.out.println(add.calculate(1.0,2.0));
		System.out.println(add.getInfo());
		System.out.println(Enum.valueOf(AbstractEnum.class, "ADD"));
	}
}
