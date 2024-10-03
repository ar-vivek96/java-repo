package codeio;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class MouseAct extends Frame implements MouseListener {
	Label status;
	
		MouseAct()
		{
			super("MOUSE EVENT");
			setSize(1000,600);
			setLayout(new FlowLayout());
			setVisible(true);
			addMouseListener(this);
			status=new Label("This is a Mouse");
		//	status.setBounds(100,100,300,50);
			status.setBackground(Color.WHITE);
			add(status);
			
		}
		
		
	public static void main(String[] args) {
		
			MouseAct m=new MouseAct();
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		
		status.setText("Mouse Cliked");
	}


	@Override
	public void mousePressed(MouseEvent e) {
		status.setText("Mouse Pressed");
		
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
			status.setText("Mouse Released");
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		status.setText("Mouse Entered");
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		status.setText("Mouse Exited");
		
	}

}
