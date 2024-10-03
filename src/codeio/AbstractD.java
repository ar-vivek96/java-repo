package codeio;
abstract class Computer
{
	public abstract void turnOff();
	public void turnOn()
	{
		System.out.println("Turn on");
	}
}
class HP extends Computer
{
	public void turnOn()
	{
		System.out.println("Turn on 1");
	}

	@Override
	public void turnOff() {
		{
			System.out.println("Turn Off HP");
		}
		
	}
}
class Dell extends Computer
{
	public void turnOn()
	{
		System.out.println(" Turn on Dell");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn Off Dell");
	}
}
public class AbstractD {

	public static void main(String[] args) {

		 HP c=new HP();
		 c.turnOn();
		 c.turnOff();
		 Dell d=new Dell();
		 d.turnOff();
		 d.turnOff();
		 

	}

}
