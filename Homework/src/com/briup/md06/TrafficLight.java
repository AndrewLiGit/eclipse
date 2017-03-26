package com.briup.md06;

public enum TrafficLight {
	
	RED{
		public void next(){
			System.out.println("时间："+getValue()+"秒");
			System.out.println("下一个路灯是黄灯。。。");
		}
	},
	GREEN{
		public void next(){
			System.out.println("时间："+getValue()+"秒");
			System.out.println("下一个路灯是红灯。。。");
		}
	},
	YELLOW{
		public void next(){
			System.out.println("时间："+getValue()+"秒");
			System.out.println("下一个路灯是绿灯。。。");
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
