package awt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Layout extends Frame implements ActionListener
{
	Layout()
	{
		super("Form");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		Label lbl=new Label("Email");
		Label lbl1=new Label("Password");
		Label lbl2=new Label("Age");
		TextField email=new TextField();
		email.setBounds(150,130,200,30);
		TextField password=new TextField();
		password.setBounds(150,160,200,30);
		TextField age=new TextField();
		Button btn=new Button("Submit");
		btn.setBounds(150,220,100,30);
		age.setBounds(150,190,200,30);
		lbl.setBounds(30,130,100,30);
		lbl1.setBounds(30,160,100,30);
		lbl2.setBounds(30,190,100,30);
		add(lbl);
		add(lbl1);
		add(lbl2);
		add(email);
		add(password);
		add(age);
		add(btn);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(email.getText());
				System.out.println(password.getText());
				System.out.println(age.getText());	
			}
		});
}
}
public class LayoutDemo {

	public static void main(String[] args) {
		
		Layout l=new Layout();
	}

}
