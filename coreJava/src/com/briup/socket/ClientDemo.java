package com.briup.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("192.168.3.167",8989);
		OutputStream os = socket.getOutputStream();
		String string = "∏Á√«¿¥¡À£°£°£°";
		os.write(string.getBytes());
		os.close();
		socket.close();
	}
}
