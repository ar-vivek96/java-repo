package Swingdemo;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
class Confirm extends Frame implements ActionListener{
	JFrame f;
	JButton btn;
	Confirm()
	{
		super("Frame");
		setSize(600,600);
		setLayout(null);
		setVisible(true);
		btn=new JButton("Click");
		btn.setBounds(100,100,200,30);
		btn.addActionListener(this);
		add(btn);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int a=JOptionPane.showConfirmDialog(getParent(), "Processeing");
		if(a==JOptionPane.CANCEL_OPTION)
		{
			btn.setText("CANCELLED");
		}
		else if(a==JOptionPane.NO_OPTION)
		{
			btn.setText("NO");
		}
		else if(a==JOptionPane.YES_OPTION)
		{
			btn.setText("Yes");
		}
		else if(a==JOptionPane.CLOSED_OPTION)
		{
			btn.setText("Closed");
		}
		
		
	}
}
public class ConfirmDialo {

	public static void main(String[] args) {
		new Confirm();

	}

}
