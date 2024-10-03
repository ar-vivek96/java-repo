package DataStructure;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
	
		int a[]= {10,5,16,70,5,44,60,15};
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
