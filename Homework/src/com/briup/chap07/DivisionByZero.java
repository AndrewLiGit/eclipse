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
			throw new weiLingException("除数不能为零，你让除数为零了。。。");
			int result = x/y;
			System.out.println(x+"/"+y+" = "+result);
			
		}catch(weiLingException e){
		System.out.println("除数不能为零。。。");
		}
	}
	public static void main(String[] args)//throws weiLingException
	{
		// TODO Auto-generated method stub
		division(10, 0);
	}

}
