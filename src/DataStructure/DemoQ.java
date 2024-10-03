package DataStructure;

import java.util.Arrays;

public class DemoQ {
	public static void main(String args[])
	{
	int arr1[]= {2,5,9,4,3,8,7,1,10};
	Qsort.quickSort(arr1,0,arr1.length-1);
	System.out.println(Arrays.toString(arr1));
			
	}

}
