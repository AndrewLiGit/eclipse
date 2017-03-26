package com.briup.chap07;

public class OwnExceptionHandler {
	
	public static void main(String args[]) throws OwnException {
		
		OwnExceptionSource oes = new OwnExceptionSource();
		oes.a();
	}
}
