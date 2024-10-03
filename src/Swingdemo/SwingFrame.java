package Swingdemo;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.*;
class UI extends JFrame implements ActionListener 
{
	JButton btn;
	JLabel lbl;
	JTextField txtfield;
	JPasswordField pw;
	UI()
	{
		super("Frame");
		setSize(600,600);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		btn=new JButton("Show");
		btn.setBounds(50,50,200,40);
		btn.addActionListener(this);
		lbl=new JLabel("Password");
		lbl.setBounds(30,250,300,40);
		txtfield=new JTextField();
		txtfield.setBounds(50,100,200,40);
		txtfield.setEditable(false);
		pw=new JPasswordField();
		pw.setBounds(50,150,200,50);
		pw.setEchoChar('1');
		add(btn);
		add(lbl);
		add(txtfield);
		add(pw);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		lbl.setText("Password:"+new String(pw.getPassword()));
		
	}
}

public class SwingFrame {

	public static void main(String[] args) {
		new UI();

	}

}
