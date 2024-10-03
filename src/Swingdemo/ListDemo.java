package Swingdemo;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListApp extends JFrame implements ListSelectionListener
{
	JTextArea txt;
	JList<String> jl;
	ListApp()
	{
		super("Text Area");
		setSize(600,600);
		setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		String arr[]= {"Sanwidch","Cupcake","Donut","Jellybean","KitKat","GingerBread","Alpha","Beta","Ice Cream","Honey Comb"};
		jl=new JList<>(arr);
		jl.setBounds(50,100,200,300);
		jl.setLayoutOrientation(JList.VERTICAL);
		jl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		txt=new JTextArea();
		txt.setBounds(50,500,200,200);
		jl.addListSelectionListener(this);
		add(txt);
		add(jl);
		setVisible(true);
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
			txt.setText("Selected"+jl.getSelectedValuesList());
		
		
	}
}

public class ListDemo {
	public static void main(String[] args) {
		new ListApp(); 

	}

}
