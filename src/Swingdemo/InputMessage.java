package Swingdemo;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

class demo extends JFrame
{
	demo(){
	super("Frame");
	setSize(600,600);
	setLayout(null);
	setVisible(true);
	ImageIcon i=new ImageIcon("C:\\Users\\vivek\\Downloads\\cs.png");
	//Integer a[]= {10,20,30};
	String str[]= {"yes","NO"};
	JOptionPane.showInputDialog(getParent(),"Your age?","My Title",JOptionPane.QUESTION_MESSAGE,i,str,str[0]);
	this.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	});
	
}
}

public class InputMessage {

	public static void main(String[] args) {
		new demo();
		
	}

}
