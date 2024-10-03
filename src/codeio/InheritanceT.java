package codeio;
class GrandFather
{
	int age=90;
	public void dis()
	{
		System.out.println("Grand Father");
	}
}
class Father extends GrandFather
{
	char Gender='M';
	public void display()
	{
		System.out.println("Parent Class");
	}
}
class Child extends Father
{
	public void print()
	{
		System.out.println("Child Class");
	}
}
public class InheritanceT {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.display();
		c.print();
		c.dis();
		System.out.println(c.age);
		System.out.println(c.Gender);
	}

}
