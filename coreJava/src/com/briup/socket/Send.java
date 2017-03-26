package com.briup.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send implements Runnable{
	private DatagramSocket dSocket;
	public Send(DatagramSocket dSocket){
		this.dSocket = dSocket;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		BufferedReader buffr = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			while((line=buffr.readLine())!=null){
				byte[] b = line.getBytes();
				DatagramPacket dPacket = new DatagramPacket(b, b.length,InetAddress.getByName("192.168.3.255"),10001);
				dSocket.send(dPacket);
				if(line.equals("886")){
					break;
				}
			}
			dSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
