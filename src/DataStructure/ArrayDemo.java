package DataStructure;

import java.lang.reflect.Array;

public class ArrayDemo {

	public static void main(String[] args) {
		String b[]= {"Vivek","Naveen","Sundar"};
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[3]=30;
		a[4]=40;
		a[2]=50;
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+"");
		}
		for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
		
		}
	}

}
