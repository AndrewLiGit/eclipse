package com.briup.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Race implements Runnable{
	private DatagramSocket dSocket;
	public Race (DatagramSocket dSocket){
		this.dSocket = dSocket;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (true) {
				byte[] buf = new byte[1024];
				DatagramPacket dPacket = new DatagramPacket(buf, buf.length);
				
				dSocket.receive(dPacket);
				String ip = dPacket.getAddress().getHostAddress();
				//int port = dPacket.getPort();
				String string = new String(dPacket.getData(),0,dPacket.getLength());
				System.out.println(ip+":"+string);
				if(string.equals("886")){
					System.out.println(ip+"ÕÀ≥ˆ¡ƒÃÏ “°£");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
