package codeio;
class Parent 
{
	int a=55;
	public void display()
	{
		System.out.println("Father");
	}
}
class Son1 extends Parent
{
	public void dis()
	{
		System.out.println("Son ");
	}

}
class Daughter extends Parent
{
	public void print()
	{
		System.out.println("Daughter");
	}
}


public class HierarchicalInher {

	public static void main(String[] args) {
		
		Son1 s=new Son1();
		s.dis();
		s.display();
		System.out.println(s.a);
		Daughter d=new Daughter();
		d.display();
		d.print();
		System.out.println(d.a);

	}

}
