package com.briup.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo1 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.3.167",8989);
		OutputStream oStream = socket.getOutputStream();
		oStream.write("∏Á√«¿¥¡À°£°£".getBytes());
		InputStream iStream = socket.getInputStream();
		byte[] b = new byte[1024];
		int len = iStream.read(b);
		String string = new String(b,0,len);
		System.out.println(string);
		socket.close();
	}
}
