package Swingdemo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

class Combo extends JFrame implements ActionListener,ItemListener
{
	JComboBox<String> cb;
	Combo()
	{
		super("Combo Box");
		String []name= {"C++","Java","C#","Phython"};
		cb=new JComboBox<>(name);
		cb.setBounds(50,100,200,20);
		cb.addItem("VB.Net");
		cb.removeItem("C++");
		//cb.setEditable(true);
		setSize(600,600);
		setLayout(null);
		setVisible(true);
		
		add(cb);
		cb.addActionListener(this);
		cb.addItemListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
			
		System.out.println("Itemevent");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("Action Event");
		
	}
}
public class ComboBox {

	public static void main(String[] args) {
		
		new Combo();

	}

}
