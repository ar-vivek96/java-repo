package DataStructure;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[]= {10,5,26,3,15,22,90,1,6,8,30};
		Sort.selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		int arr1[]= {1, 3, 5, 6, 8, 10, 15, 22, 26, 30, 90};
		Sort.bubbleSort(arr1);
		System.out.println(Arrays.toString(arr1));
		int arr2[]= {5,8,2,4,3,9};
		Sort.insertionSort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}
