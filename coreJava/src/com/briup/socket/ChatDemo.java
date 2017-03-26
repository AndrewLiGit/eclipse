package com.briup.socket;

import java.net.DatagramSocket;
import java.net.SocketException;

public class ChatDemo {
	public static void main(String[] args) throws SocketException {
		DatagramSocket send = new DatagramSocket();
		DatagramSocket race = new DatagramSocket(10001);
		
		new Thread(new Send(send)).start();
		new Thread(new Race(race)).start();
	}
}
