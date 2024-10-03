package codeio;
class Cake1 implements Runnable
{
	public void run()
	{
		System.out.println("Mixing Ingredients for Cake"+Thread.currentThread().getId());
		System.out.println("Baking Cake"+Thread.currentThread().getId());
		System.out.println("Decorating Cake"+Thread.currentThread().getId());
	}
}
public class RunnableInterface {

	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
		Cake1 c=new Cake1();
		Thread t=new Thread(c);
		t.start();}
		
		

	}

}
