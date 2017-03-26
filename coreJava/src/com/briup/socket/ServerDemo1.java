package com.briup.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo1 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8989);
		Socket socket = ss.accept();
		String ip = socket.getInetAddress().getHostAddress();
		InputStream iStream = socket.getInputStream();
		byte[] b = new byte[1204];
		int len = iStream.read(b);
		String string = new String(b,0,len);
		System.out.println(ip+":"+string);
		OutputStream oStream = socket.getOutputStream();
		oStream.write(" ’µΩ".getBytes());
		socket.close();
		ss.close();
	}
}
