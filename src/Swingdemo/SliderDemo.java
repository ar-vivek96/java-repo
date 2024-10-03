package Swingdemo;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
class Slider extends JFrame implements ChangeListener{
	JSlider js;
	JLabel lbl;
	Slider()
	{
		super("Spinner");
		setSize(600,600);
		setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		js=new JSlider();
		js.setBounds(50,100,400,50);
		js.setMinorTickSpacing(2);
		js.setMajorTickSpacing(10);
		js.setPaintTicks(true);
		js.setPaintLabels(true);
		js.setMaximum(150);
		js.setMinimum(0);
		lbl=new JLabel("Value:5");
		lbl.setBounds(50,150,200,40);
		js.addChangeListener(this);
		add(js);
		add(lbl);
		
		setVisible(true);
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		lbl.setText("Value: "+js.getValue());
		
		
			
		
	}
}

public class SliderDemo {

	public static void main(String[] args) {
		new Slider();

	}

}
