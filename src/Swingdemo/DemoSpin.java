package Swingdemo;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
class Spinner1 extends JFrame implements ChangeListener
{
	JSpinner sp;
	JLabel lbl;
	Spinner1()
	{
		super("Spinner");
		setSize(600,600);
		setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		String str[]= {"Apple","Samsung","One Plus","htc"};
		SpinnerModel sm=new SpinnerListModel(str);
		 sp=new JSpinner(sm);
		sp.setBounds(50,100,200,40);
		sp.addChangeListener(this);
		lbl=new JLabel("Value : 0 ");
		lbl.setBounds(50,250,200,40);
		add(sp);
		add(lbl);
		setVisible(true);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
		lbl.setText("Value:"+sp.getValue());
		
	}
}

public class DemoSpin {

	public static void main(String[] args) {
		new Spinner1();
	}

}
