package com.briup.socket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("上传客户端...");
		File file = new File("Test24.txt");
		System.out.println(file.exists());
		Socket socket = new Socket("127.0.0.1",10005);
		BufferedReader bReader = new BufferedReader(new FileReader(file));
		PrintWriter pWriter = new PrintWriter(socket.getOutputStream(),true);
		
		String line = null;
		while((line=bReader.readLine())!=null){
			pWriter.println(line);
		}
		socket.shutdownOutput();
		BufferedReader brIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String string = brIn.readLine();
		System.out.println(string);
		
		brIn.close();
		socket.close();
	}
}
