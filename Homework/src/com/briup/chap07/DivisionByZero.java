package com.briup.chap07;

class weiLingException extends Exception{
	weiLingException(){}
	weiLingException(String msg){
		super(msg);
	}
}

public class DivisionByZero {

	public static void division(int x,int y)//throws weiLingException
	{
	try {
		if(y==0)
			throw new weiLingException("��������Ϊ�㣬���ó���Ϊ���ˡ�����");
			int result = x/y;
			System.out.println(x+"/"+y+" = "+result);
			
		}catch(weiLingException e){
		System.out.println("��������Ϊ�㡣����");
		}
	}
	public static void main(String[] args)//throws weiLingException
	{
		// TODO Auto-generated method stub
		division(10, 0);
	}

}
