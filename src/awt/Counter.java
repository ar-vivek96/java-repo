package awt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Counter extends JFrame {
	
	JTextField display;
	JButton increment,reset;

	Counter()
	{
		super("Tally Counter");
		setSize(1000,600);
		setVisible(true);
		setLayout(null);
		display =new JTextField();
		display.setBounds(50,50,300,30);
		increment=new JButton("Increment");
		increment.setBounds(70,100,100,30);
		reset=new JButton("Reset");
		reset.setBounds(180,100,100,30);
		increment.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str=display.getText();
				int num=Integer.parseInt(str);
				display.setText(String.valueOf(++num));
			}
		});
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

					display.setText("0");		
			}
			
		});
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
			
		});
		
		add(display);
		add(increment);
		add(reset);
		
		
	}
	public static void main(String[] args) {
			
		Counter c=new Counter();
	}

}
