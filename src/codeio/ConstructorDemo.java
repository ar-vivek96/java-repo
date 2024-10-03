package codeio;
class Sample
{
	int roll;
	int marks;
	
	Sample(int r,int m)
	{
		roll=r;
		marks=m;
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		
		Sample s=new Sample(20202,100);
		System.out.println("Roll NO:"+s.roll);
		System.out.println("Marks:"+s.marks);

	}

}
