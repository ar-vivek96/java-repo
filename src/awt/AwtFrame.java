package awt;
import java.awt.*;
class Simple extends Frame
{
	Simple(){
		super("Button");
	Button btn =new Button("Click Me");
	Button btn1=new Button("Click Me");
	btn.setBounds(70,50,100,30);
	Label l=new Label("Enter ");
	l.setBounds(20,50,50,30);
	TextField t=new TextField();
	TextArea txt=new TextArea();
	Checkbox c=new Checkbox("Male");
	Choice ch=new Choice();
	ch.add("India");
	ch.add("Sri lanka");
	ch.add("USA");
	add(ch);
	add(c);
	
	add(txt);
	add(t);
	add(l);
	add(btn);
	add(btn1);
	setLayout(null);
	setSize(1000,600);
	setVisible(true);
	}
	
}
public class AwtFrame {

	public static void main(String[] args) {
		
		Simple s=new Simple();
	}

}
