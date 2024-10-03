package Swingdemo;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
class Check extends JFrame implements ItemListener
{
	JLabel lbl;
	JCheckBox ch1,ch2,ch3;
	
	Check()
	{
		super("Dialog Box");
		
		this.setLocationRelativeTo(null);
		lbl=new JLabel("CheckBox:");
		lbl.setBounds(50,100,500,40);
		ch1=new JCheckBox("Programming");
		ch1.addItemListener(this);
		ch2=new JCheckBox("Designning");
		ch2.addItemListener(this);
		ch3=new JCheckBox("Net Working");
		ch3.addItemListener(this);
		ch1.setBounds(50,150,200,30);
		ch2.setBounds(50,200,200,30);
		ch3.setBounds(50,250,200,30);
		add(lbl);
		add(ch1);
		add(ch2);
		add(ch3);
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
	public void itemStateChanged(ItemEvent e) {
		
		if(ch1.isSelected()==true)
		{
			lbl.setText("Programming Checked");
		}
		else if(ch2.isSelected()==true)
		{
			lbl.setText("Designning Checked");
		}
		else if(ch3.isSelected()==true)
		{
			lbl.setText("Net Working Checked");
		}
		else
		{
			lbl.setText("Unchecked");
		}
	}
	
}
public class CheckBoxDe {

	public static void main(String[] args) {
		new Check();
	}

}
