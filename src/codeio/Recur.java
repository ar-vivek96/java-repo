package codeio;
class Rec
{
	public void natpri(int n)
	{
			if(n==1)
			{
				System.out.println(1);
			}
			else {
				System.out.print(n+" ");
				natpri(n-1);
			}
	}

}


public class Recur {

	public static void main(String[] args) {

		Rec  r=new Rec();
		r.natpri(10);

	}

}
