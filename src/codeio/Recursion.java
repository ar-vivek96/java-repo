package codeio;
class Fact
{
	int f=1;
	int n;
	public int fact(int n) {
			this.n=n;
	{
		if(n==0)
			return 1;
		else {
			f=n*fact(n-1);
		}
		return f;
		}
	} 
/*			
		for(int i=1;i<=n;i++)	
		{
			f=f*i;
		}
		return f;
}*/
}
public class Recursion {

	public static void main(String[] args) {
		
		Fact g=new Fact();
		int Factorial=g.fact(5);
		System.out.println("Factorial:"+Factorial);
	}

}
