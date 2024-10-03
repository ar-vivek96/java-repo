package codeio;
class Cake extends Thread
{
	
	public void run()
	{	try {
				
		System.out.println("Mixing Ingredients for cake"+Cake.currentThread().getPriority());
		System.out.println("Bake the cake"+Cake.currentThread().getName());
		System.out.println(" Cake Decoration "+Cake.currentThread().getName());
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
public class Threading {

	public static void main(String[] args) throws InterruptedException {
		
	for(int i=0;i<4;i++) {	
		Cake c=new Cake();
		c.start();
	
		
		}
		
		Cake c1=new Cake();
		c1.start();
		c1.join();
		System.out.println(c1.isAlive());
		System.out.println("vv");
		System.out.println(c1.isAlive());
		
		
	
	
		
		

	}

}
