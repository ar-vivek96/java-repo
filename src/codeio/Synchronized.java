package codeio;
class CakeCounter
{
	int cakeCount=0;
	public synchronized void increment()
	{
		cakeCount++;
	}
}
class Team implements Runnable
{
	CakeCounter counter;
	Team(CakeCounter counter)
	{
		this.counter =counter;
	}
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			counter.increment();
		}
	}
	
	
}
public class Synchronized {

	public static void main(String[] args) {
		
		CakeCounter counter=new CakeCounter();
		Team team1=new Team(counter);
		Team team2=new Team(counter);
		Thread t1=new Thread(team1);
		Thread t2=new Thread(team2);
		t1.start();
		t2.start();
		try {
		t1.join();
		t2.join();
		}
		catch(Exception e)
		{
			
		}
		System.out.println(counter.cakeCount);
	}

}
