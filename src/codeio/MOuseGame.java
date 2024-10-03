package codeio;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MOuseGame extends Frame implements MouseMotionListener{
	
	int circleX=200,circleY=200,radius=90;
	MOuseGame()
	{
		super("BALL GAME");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		addMouseMotionListener(this);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillOval(circleX, circleY, radius, radius);
	}

	public static void main(String[] args) {
		
		MOuseGame m=new MOuseGame();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		int x=e.getX();
		int y=e.getY();
		if(x<circleX+radius)
		{
			circleX++;
		}
		if(x>circleX+radius);
		{
			circleX--;
		}
		if(y<circleY+radius)
		{
			circleY++;
		}
		if(y>circleY+radius)
		{
			circleY--;
		}
		repaint();
	}
	

}
