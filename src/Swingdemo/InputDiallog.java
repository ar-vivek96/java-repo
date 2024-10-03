package Swingdemo;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

class Dialog extends JFrame
{
	Dialog()
	{
		super("Dialog Box");
		setSize(600,600);
		setLayout(null);
		setVisible(true);
		this.setLocationRelativeTo(null);
		Object [] obj= {19,"Name",27.8};
		JOptionPane.showInputDialog(getParent(),"What is your Age","Age",JOptionPane.QUESTION_MESSAGE,null,obj,obj[0]);
	/*	int age=Integer.parseInt(a);
	    if(age<=20)
		JOptionPane.showMessageDialog(getParent(),"Your age is "+ age);
		else if(age>=20&&age<=40)
		JOptionPane.showMessageDialog(getParent(), "Your are Middle-aged");
		else 
			JOptionPane.showMessageDialog(getParent(), "Your are Old");*/
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
	}
}

public class InputDiallog {

	public static void main(String[] args) {
		
		new Dialog();
		
	}

}
