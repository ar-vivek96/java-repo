package codeio;
class ApplForm
{
	String name;
	int age;
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age );
	}
	public void setValue(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}

public class ClassDemo {

	public static void main(String[] args) {
		ApplForm a=new ApplForm();
		a.setValue("Vivek", 26);
		a.display();
		

	}

}
