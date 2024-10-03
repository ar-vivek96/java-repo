package DataStructure;

public class Sort {
	public static void selectionSort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int min=arr[i];
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
		
		public static void bubbleSort(int arr[])
		{
			for(int i=1;i<arr.length;i++)
			{
				boolean swapped=false;
				for(int j=0;j<arr.length-i;j++)
				{
					if(arr[j]>arr[j+1])
					{
						swapped=true;
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
					
				}
				if(!swapped)
					break;
				
			}
		}
		public static void insertionSort(int arr[])
		{
			for(int i=1;i<arr.length;i++)
			{
				for(int j=i;j>0;j--)
				{
					if(arr[j]<arr[j-1])
					{
						int temp=arr[j];
						arr[j]=arr[j-1];
						arr[j-1]=temp;
					}
					else
					{
						break;
					}
				}
			}
		}
			
	
}
