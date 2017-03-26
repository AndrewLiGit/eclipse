package com.briup.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8989);
		Socket socket = ss.accept();
		String ip = socket.getInetAddress().getHostAddress();
		InputStream in = socket.getInputStream();
		byte[] b = new byte[1024];
		int len = in.read(b);
		String string = new String(b,0,len);
		System.out.println(ip+":"+string);
		socket.close();
		ss.close();
	}
}
