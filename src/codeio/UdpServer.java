package codeio;

import java.net.*;

public class UdpServer {

	public static void main(String[] args) throws Exception {
		
		DatagramSocket dgs=new DatagramSocket();
		String msg="Welcome";
		InetAddress ip=InetAddress.getByName("localhost");
		DatagramPacket dgp=new DatagramPacket(msg.getBytes(),msg.length(),ip,9999);
		dgs.send(dgp);
		dgs.close();
		
	}

}
