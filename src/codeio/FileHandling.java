package codeio;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class FileHandling {

	public static void main(String[] args) {
		try {
		File f=new File("DEMO.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("Welcome to java");
		fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
