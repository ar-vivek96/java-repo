package codeio;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class User2 extends Frame implements ActionListener,Runnable {
	TextArea txtarea;
	TextField txtfield;
	Button send;
	Socket socket;
	DataInputStream datainputstream;
	DataOutputStream dataoutputstream;
	Thread chat;
	
	User2()
	{
		super("User2");
		setSize(600,600);
		setLayout(null);
		setVisible(true);
		txtarea=new TextArea();
		txtarea.setBounds(20,50,400,200);
		txtfield=new TextField();
		txtfield.setBounds(30,250,200,50);
		send=new Button("Send");
		send.setBounds(50,350,100,50);
		send.addActionListener(this);
		add(send);
		add(txtarea);
		add(txtfield);
		chat=new Thread();
		chat.setDaemon(true);
		chat.start();
		
		try {
		socket=new Socket("localhost",12000);
		datainputstream=new DataInputStream(socket.getInputStream());
		dataoutputstream=new DataOutputStream(socket.getOutputStream());
		}
		catch(Exception e)
		{
			
		}
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	@Override
	public void run() {
		
		while(true)
		{
			try {
				String msg =datainputstream.readUTF();
				txtarea.append("User1:"+msg+"\n");
			} catch (IOException e) {}
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String msg=txtfield.getText();
		txtarea.append("user2"+msg+"\n");
		txtfield.setText(null);
		try {
			dataoutputstream.writeUTF(msg);
			dataoutputstream.flush();
		} catch (IOException e1) {
			
		}
		}

	


	
	

	public static void main(String[] args) {
		
		User2 u=new User2();
	}


		
}
