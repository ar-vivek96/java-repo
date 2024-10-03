package codeio;
import java.io.DataInputStream;
import java.net.Socket;
public class SocketEx {

	public static void main(String[] args) throws Exception {

		Socket socket =new Socket("localhost",9999);
		DataInputStream dis=new DataInputStream(socket.getInputStream());
		String msg=dis.readUTF();
		System.out.println("Server Says:"+msg);
		

	}

}
