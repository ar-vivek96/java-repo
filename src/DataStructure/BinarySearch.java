package DataStructure;

public class BinarySearch {

	public static int search(int arr[],int target) {
		
		int start,end,mid;
		start=0;
		end=arr.length-1;
		boolean asc=false;
		if(arr[start]<arr[end])
			asc=true;
		if(asc) {
		while(start<=end)
		{
			mid=(start+end)/2;
			if(target>arr[mid])
			{
				start=mid+1;
			}
			else if(target<arr[mid])
			{
				end=mid-1;
			}
			else
			{
				return mid;
			}
		}
	}
		else
		{
			while(start<=end)
			{
				mid=(start+end)/2;
				if(target>arr[mid])
				{
					end=mid-1;
				}
				else if(target<arr[mid])
				{
					start=mid+1;
				}
				else
				{
					return mid;
				}
			}	
				
		}
		return -1;
		

	}

}
