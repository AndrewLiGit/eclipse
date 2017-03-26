package com.briup.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10005);
		Socket socket = ss.accept();
		System.out.println(socket.getInetAddress().getHostAddress()+":connection");
		
		BufferedReader bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("server.txt"));
		
		String line = null;
		while((line=bReader.readLine())!=null){
			bWriter.write(line);
			bWriter.newLine();
			bWriter.flush();
		}
		PrintWriter pWriter = new PrintWriter(socket.getOutputStream(),true);
		pWriter.println("上传成功...");
		
		bWriter.close();
		socket.close();
		ss.close();
	}
}
