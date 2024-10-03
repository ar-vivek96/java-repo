package codeio;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.*;

public class CalculatorD extends Frame implements ActionListener {
	TextField display;
	Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,plus,minus,multiply,division,clear,equal;
	CalculatorD()
	{
		super("Calculator");
	setSize(700,600);
	setLayout(null);
	setVisible(true);
	setBackground(Color.WHITE);
	display=new TextField("");
	display.setBounds(40,40,300,50);
	display.setBackground(Color.LIGHT_GRAY);
	btn7=new Button("7");
	btn7.setBounds(40,120,50,50);
	btn7.setBackground(Color.PINK);
	btn7.addActionListener(this);
	btn8=new Button("8");
	btn8.setBounds(120,120,50,50);
	btn8.addActionListener(this);
	btn8.setBackground(Color.PINK);
	btn9=new Button("9");
	btn9.setBounds(200,120,50,50);
	btn9.addActionListener(this);
	btn9.setBackground(Color.PINK);
	multiply=new Button("*");
	multiply.setBounds(280,120,50,50);
	multiply.addActionListener(this);
	multiply.setBackground(Color.PINK);
	btn4=new Button("4");
	btn4.setBounds(40,220,50,50);
	btn4.addActionListener(this);
	btn4.setBackground(Color.PINK);
	btn5=new Button("5");
	btn5.setBounds(120,220,50,50);
	btn5.addActionListener(this);
	btn5.setBackground(Color.PINK);
	btn6=new Button("6");
	btn6.setBounds(200,220,50,50);
	btn6.addActionListener(this);
	btn6.setBackground(Color.PINK);
	minus=new Button("-");
	minus.setBounds(280,220,50,50);
	minus.addActionListener(this);
	minus.setBackground(Color.PINK);
	btn1=new Button("1");
	btn1.setBounds(40,320,50,50);
	btn1.addActionListener(this);
	btn1.setBackground(Color.PINK);
	btn2=new Button("2");
	btn2.setBounds(120,320,50,50);
	btn2.addActionListener(this);
	btn2.setBackground(Color.PINK);
	btn3=new Button("3");
	btn3.setBounds(200,320,50,50);
	btn3.addActionListener(this);
	btn3.setBackground(Color.PINK);
	plus=new Button("+");
	plus.setBounds(280,320,50,50);
	plus.addActionListener(this);
	plus.setBackground(Color.PINK);
	btn0=new Button("0");
	btn0.setBounds(40,420,50,50);
	btn0.addActionListener(this);
	btn0.setBackground(Color.PINK);
	equal=new Button("=");
	equal.setBounds(120,420,50,50);
	equal.addActionListener(this);
	equal.setBackground(Color.PINK);
	clear=new Button("C");
	clear.setBounds(200,420,50,50);
	clear.addActionListener(this);
	clear.setBackground(Color.PINK);
	division=new Button("/");
	division.setBounds(280,420,50,50);
	division.addActionListener(this);
	division.setBackground(Color.PINK);

	add(display);
	add(btn7);
	add(btn8);
	add(btn9);
	add(multiply);
	add(btn4);
	add(btn5);
	add(btn6);
	add(minus);
	add(btn1);
	add(btn0);
	add(equal);
	add(btn2);
	add(btn3);
	add(plus);
	add(clear);
	add(division);
	
	this.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
		
	});
	

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==btn0)
		{
			String exp=display.getText();
			exp=exp+"0";
			display.setText(exp);
		}
		if(e.getSource()==btn1)
		{
			String exp=display.getText();
			exp=exp+"1";
			display.setText(exp);
		}
		if(e.getSource()==btn2)
		{
			String exp=display.getText();
			exp=exp+"2";
			display.setText(exp);
		}
		if(e.getSource()==btn3)
		{
			String exp=display.getText();
			exp=exp+"3";
			display.setText(exp);
		}
		if(e.getSource()==btn4)
		{
			String exp=display.getText();
			exp=exp+"4";
			display.setText(exp);
		}
		if(e.getSource()==btn5)
		{
			String exp=display.getText();
			exp=exp+"5";
			display.setText(exp);
		}
		if(e.getSource()==btn6)
		{
			String exp=display.getText();
			exp=exp+"6";
			display.setText(exp);
		}
		if(e.getSource()==btn7)
		{
			String exp=display.getText();
			exp=exp+"7";
			display.setText(exp);
		}
		if(e.getSource()==btn8)
		{
			String exp=display.getText();
			exp=exp+"8";
			display.setText(exp);
		}
		if(e.getSource()==btn9)
		{
			String exp=display.getText();
			exp=exp+"9";
			display.setText(exp);
		}
		if(e.getSource()==plus)
		{
			String exp=display.getText();
			exp=exp+"+";
			display.setText(exp);
		}
		if(e.getSource()==division)
		{
			String exp=display.getText();
			exp=exp+"/";
			display.setText(exp);
		}
		if(e.getSource()==minus)
		{
			String exp=display.getText();
			exp=exp+"-";
			display.setText(exp);
		}
		if(e.getSource()==multiply)
		{
			String exp=display.getText();
			exp=exp+"*";
			display.setText(exp);
		}
		if(e.getSource()==clear)
		{
			display.setText(null);
		}
		if(e.getSource()==equal)
		{
			char op='+';
			int i;
			String tempA="0";
			String tempB="0";
			String exp=display.getText();
			
			for(i=0;i<exp.length();i++)
			{
				if(Character.isDigit(exp.charAt(i)))
					{
						tempA=tempA+exp.charAt(i);
				}
				else
				{
					op=exp.charAt(i);
					break;
				}
				
			}
			tempB=exp.substring(i+1);
			int a=Integer.parseInt(tempA);
			int b=Integer.parseInt(tempB);
			int res=0;
			switch(op)
			{
			case '+':
					res=a+b;
					break;
			case '-':
				res=a-b;
				break;
			case '*':
				res=a*b;
				break;
			case '/':
				res=a/b;
				break;
			}
			display.setText(String.valueOf(res));
		}
		
	}		
			
		
		
		
		
		

	


	public static void main(String[] args) {
		
		CalculatorD d=new CalculatorD();
	}



	
}
