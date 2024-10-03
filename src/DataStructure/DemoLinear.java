package DataStructure;

import java.util.Arrays;

public class DemoLinear {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println(LinearSearch.find(arr,4));
		System.out.println(LinearSearch.find(arr, 7));
		System.out.println(LinearSearch.contains(arr, 8));
		String str="vijay";
		System.out.println(LinearSearch.find(str,'v'));
		System.out.println(LinearSearch.contains(str,'v'));
		int arr1 [][]= {{1,2,3},
					{4,5,6},
					{7,6,5}
					};
		int result[]=LinearSearch.find(arr1, 9);
		System.out.println(Arrays.toString(result));

	}
	

}
