package codeio;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpClient {

	public static void main(String[] args) throws Exception {
	
		DatagramSocket dgs =new DatagramSocket(9999);
		byte[] buffer=new byte[1024];
		DatagramPacket dgp=new DatagramPacket(buffer,1024);
		dgs.receive(dgp);
		String msg=new String(dgp.getData());
		System.out.println(msg);
		dgs.close();
}
}
