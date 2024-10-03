package DataStructure;

import java.util.Arrays;

public class DemoMerge {

	public static void main(String[] args) {
		
		int arr[]= {9,4,7,1,6,2,8,4};
		arr=Sorting.mergeSort(arr);
		System.out.println(Arrays.toString(arr));
		Sorting.mergeSortingPlace(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
		
	}

}
