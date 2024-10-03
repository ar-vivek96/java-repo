package codeio;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;

public class ServersocketDe {

	public static void main(String[] args) throws IOException {
			
		ServerSocket Ss=new ServerSocket(9999);
		String msg="Welcome";
		Socket socket=Ss.accept();
		DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
		dos.writeUTF(msg);
		dos.flush();
		dos.close();
		
	

	}

}
