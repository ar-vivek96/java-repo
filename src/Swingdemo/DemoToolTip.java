package Swingdemo;
import javax.swing.*;
class Tool extends JFrame
{
	JTextField txt1,txt2;
	Tool(){
		super("Tool Tip");
		setSize(600,600);
		setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		txt1=new JTextField();
		txt2=new JTextField();
		txt1.setBounds(50,100,200,30);
		txt2.setBounds(50,150,200,30);
		txt1.setToolTipText("Enter Name");
		txt2.setToolTipText("Password");
		add(txt1);
		add(txt2);
		setVisible(true);
	}
}
public class DemoToolTip {

	public static void main(String[] args) {

		new Tool();
	}

}
