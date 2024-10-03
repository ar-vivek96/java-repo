package Swingdemo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
class Radio extends JFrame implements ActionListener
{
	JLabel lbl,result;
	JRadioButton btn1,btn2,btn3;
	ButtonGroup bg;
	Radio()
	{
		super("Radio Button");
		
		lbl=new JLabel("Which Group You Studied In 12th std");
		lbl.setBounds(50,100,400,50);
		result=new JLabel("Result: not Selected ");
		result.setBounds(50,300,300,30);
		btn1=new JRadioButton("Bio MAths",true);
		btn1.setBounds(50,150,200,30);
		btn2=new JRadioButton("Computer Science",false);
		btn2.setBounds(50,200,200,30);
		btn3=new JRadioButton("Accountancy",false);
		btn3.setBounds(50,250,200,30);
		bg=new ButtonGroup();
		bg.add(btn1);
		bg.add(btn2);
		bg.add(btn3);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		add(lbl);
		add(btn1);
		add(btn2);
		add(btn3);
		add(result);
		setSize(600,600);
		setLayout(null);
		setVisible(true);
		

		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(btn1.isSelected()==true)
		{
			result.setText("Result:Bio Maths");
		}
		else if(btn2.isSelected()==true)
		{
			result.setText("Result:Computer Science");
		}
		else if(btn3.isSelected()==true)
		{
			result.setText("Result:Accountancy");
		}
	
	}
}

public class RadioBu {

	public static void main(String[] args) {
		
		new Radio();
	}

}
