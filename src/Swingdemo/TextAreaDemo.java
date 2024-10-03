package Swingdemo;
import javax.swing.*;
class Area extends JFrame
 {
	JLabel lbl;
	JTextArea txt;
	Area()
	{
		super("Text Area");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setSize(600,600);
		setLayout(null);
		txt=new JTextArea();
		txt.setBounds(50,100,300,200);
		txt.setLineWrap(true);
		txt.setWrapStyleWord(true);
		lbl=new JLabel("---------------");
		add(lbl);
		add(txt);
		
		setVisible(true);
	}
}
public class TextAreaDemo {

	public static void main(String[] args) {
		
		new Area();

	}

}
