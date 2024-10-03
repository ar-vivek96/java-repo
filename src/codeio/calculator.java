package codeio;
import java.awt.*;
import java.awt.Frame;

class cal extends Frame
{
	TextField display;
	Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,plus,minus,multiply,div,clear,equal;
	cal()
	{
		super("Calculator");
		setSize(700,600);
		setLayout(null);
		
		display=new TextField();
		display.setBounds(40,40,300,50);
		btn7=new Button("7");
		btn7.setBounds(40,120,50,50);
		btn8=new Button("8");
		btn8.setBounds(120,120,50,50);
		btn9=new Button("9");
		btn9.setBounds(200,120,50,50);
		multiply=new Button("*");
		multiply.setBounds(300,120,50,50);
		btn4=new Button("4");
		btn4.setBounds(40,220,50,50);
		btn5=new Button("5");
		btn5.setBounds(120,220,50,50);
		btn6=new Button("6");
		btn6.setBounds(200,220,50,50);
		minus=new Button("-");
		minus.setBounds(280,220,50,50);
		btn1=new Button("1");
		btn1.setBounds(40,320,50,50);
		btn2=new Button("2");
		btn2.setBounds(120,320,50,50);
		btn3=new Button("3");
		btn3.setBounds(200,320,50,50);
		btn0=new Button("+");
		btn0.setBounds(280,320,50,50);
		btn0=new Button("0");
		btn0.setBounds(40,420,50,50);
		equal=new Button("-");
		equal.setBounds(120,420,50,50);
		clear=new Button("C");
		clear.setBounds(200,420,50,50);
		div=new Button("/");
		div.setBounds(200,420,50,50);
		
		add(display);
		add(btn0);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		add(plus);
		add(minus);
		add(multiply);
		add(div);
		add(clear);
		add(equal);
		setVisible(true);
	}
	
	
}
public class calculator {
	
	public static void main(String[] args) {
		
	try {	
		cal c=new cal();
	}
	catch(Exception e)
	{
		
	}
	}

}
