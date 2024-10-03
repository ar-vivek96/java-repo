package Swingdemo;

import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Message extends Frame 
{
	
	Message()
	{
		super("Message");
		setSize(600,600);
		setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		JOptionPane.showMessageDialog(null, "Sucess","Title",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showConfirmDialog(getParent(),"Exit","Want to Leave",JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		
		
		
		
	}
}
public class MessagePane {

	public static void main(String[] args) {
		new Message();

	}

}
