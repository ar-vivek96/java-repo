package codeio;
class userDefined extends Exception
{
	
	userDefined(String msg)
	{
		super(msg);
	}
}

public class ExceptionHand {
	
	static void check(int age) throws userDefined,ArithmeticException
	{
		if(age<18)
		{
			throw new userDefined("Age is invalid");
			
		}
		else
			throw new ArithmeticException("Age is valid");
	}
	
	public static void main(String[] args) {
		
	/*	int a=5;
		int b=0;
		try {
			int c=a/b;}
		catch(Exception e) {
			System.out.println(e);
		}
	*/
		try {
			check(19);
		}
		catch(userDefined e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
