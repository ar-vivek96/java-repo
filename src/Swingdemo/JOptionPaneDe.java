package Swingdemo;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
class Option extends JFrame
{
	Option()
	{
		super("Dialog Box");
		setSize(600,600);
		setLayout(null);
		setVisible(true);
		this.setLocationRelativeTo(null);
		ImageIcon i=new ImageIcon("C:\\Users\\vivek\\Desktop\\vs.gif");
		JOptionPane.showConfirmDialog(getParent(),"message","title",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,i);
		JOptionPane.showMessageDialog(getParent(), "message","title",JOptionPane.INFORMATION_MESSAGE,i);
	/*	JOptionPane.showConfirmDialog(getParent(),"message","title",JOptionPane.YES_NO_CANCEL_OPTION);
		JOptionPane.showConfirmDialog(getParent(), "Message","title",JOptionPane.YES_NO_OPTION);
		*/
		
		
		
this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
	}
}

public class JOptionPaneDe {

	public static void main(String[] args) {
		
		new Option();

	}

}
