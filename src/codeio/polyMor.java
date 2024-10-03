package codeio;
class Poly
{
/*	public void min(int a,int b)
	{
		if(a>b)
		{
			System.out.println("min:"+b);
		}
		else
		{
			System.out.println("min:"+a);
		}
	}*/
	public int  min(int arr[])
	{
		int min;
		min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
				System.out.println("Min:"+arr[i]);
			}
		}
		return min;
	}
}
public class polyMor{

	public static void main(String[] args) {
		
		Poly p=new Poly();
		//p.min(5,6);
		int arr[]={2,3,4,5,6,};
		int c=p.min(arr);
		System.out.println(c);
	}

}
