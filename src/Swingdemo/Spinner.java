package Swingdemo;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
class Spin extends JFrame
{
	JSpinner sp;
	Spin()
	{
		super("Spinner");
		SpinnerModel sm=new SpinnerNumberModel(0,-5,5,5);
		sp=new JSpinner(sm);
		sp.setBounds(50,100,200,30);
		setSize(600,600);
		add(sp);
		setLayout(null);
		setVisible(true);
	this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
}
public class Spinner {

	public static void main(String[] args) {
	
		new Spin();
	}

}
