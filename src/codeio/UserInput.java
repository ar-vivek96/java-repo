package codeio;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
			
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number");
		int n=in.nextInt();
		System.out.println(n);
		System.out.println("Enter String:" );
		String s=in.next();
		System.out.println(s);
		System.out.println("Enter Line:");
		String line=in.nextLine();
		System.out.println(line);
		System.out.println("Enter Character:");
		char a=in.next().charAt(0);
		System.out.println(a);
	
		
		

	}

}
