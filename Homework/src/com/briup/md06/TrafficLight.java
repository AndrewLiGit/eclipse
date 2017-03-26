package com.briup.md06;

public enum TrafficLight {
	
	RED{
		public void next(){
			System.out.println("ʱ�䣺"+getValue()+"��");
			System.out.println("��һ��·���ǻƵơ�����");
		}
	},
	GREEN{
		public void next(){
			System.out.println("ʱ�䣺"+getValue()+"��");
			System.out.println("��һ��·���Ǻ�ơ�����");
		}
	},
	YELLOW{
		public void next(){
			System.out.println("ʱ�䣺"+getValue()+"��");
			System.out.println("��һ��·�����̵ơ�����");
		} 
	};
	private TrafficLight(){}
	private TrafficLight(int value){
		this.value=value;
	}
	private  int value;
	public void setValue(int value){
		this.value=value;
	}
	public int getValue(){
		return value;
	}
	public abstract void next();
}
