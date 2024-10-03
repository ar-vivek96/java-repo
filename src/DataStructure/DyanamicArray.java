package DataStructure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class Dynamic<T> implements Iterable
{
	private static final int initialcapacity=3;
	private T arr[];
	private int capacity;
	private int size;
	Dynamic()
	{
		size=0;
		arr=(T[])new Object[initialcapacity];
		capacity=initialcapacity;
	}
	public void add(T v)
	{
		if(size==capacity)
		{
			expandArray();
		}
			arr[size]=v;
		size++;
			
	}
	private void expandArray()
	{
		capacity=capacity*2;
		arr=Arrays.copyOf(arr, capacity);
		
	}
	private void  shrinkArray()
	{
		capacity=capacity/2;
		arr=Arrays.copyOf(arr, capacity);
	}


	public void insertAtpos(int pos,T value)
	{
		if(size==capacity)
		{
			expandArray();
		}
		for(int i=size-1;i>=pos;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos]=value;
		size++;
		
}
	public void deleteAtEnd()
	{
		for(int i=size-1+1;i<size;i++)
		{
			arr[i-1]=arr[i];
		}
		size--;
		
		
	}
	public void deleteAtpos(int pos)
	{
		for(int i=pos+1;i<size;i++)
		{
			arr[i-1]=arr[i];
		}
		size--;
	}
	public void deleteBeginning() {
		
		int pos=0;
		for(int i=pos+1;i<size;i++ )
		{
				arr[i-1]=arr[i];
		}
		size--;
		if(capacity>3*size&&capacity>initialcapacity)
		{
			shrinkArray();
		}
	}
	public void insertBeginning(T value)
	{
		int pos=0;
		if(size==capacity)
		{
			expandArray();
		}
		for(int i=size-1;i>=pos;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos]=value;
		size++;
	}	
	public void getIndex(T value)
	{
		for(int i=0;i<size;i++)
		{
			if(arr[i]==value)
				System.out.println("index: arr ["+i+"]");
		}
	}
	public void update(int index,T value)
	{
		arr[index]=value;
		
	}
	
	public void displayList()
	{
		for(int i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	}
	@Override
	public Iterator<T> iterator()
	{
		return new Iterator<T>() {
				
			int index=0;
			
			public T next()
			{
				return arr[index++];
			}
			public boolean hasNext()
			{
				return index<size;
			}
			
		};
	}
	
}

public class DyanamicArray {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Dynamic<Integer> list=new Dynamic<>();
		while(true) {
		System.out.println("\n----------List Menu-------------\n");
		System.out.println("1.Insert At End\n");
		System.out.println("2.Display the list\n");
		System.out.println("3.insert Specified position\n");
		System.out.println("4.Delete from specified position\n");
		System.out.println("5.Delete At end\n");
		System.out.println("6.Delete From Beginning \n");
		System.out.println("7.Insert At Beginning \n");
		System.out.println("8.Get index Value \n" );
		System.out.println("9.update Index and value \n");
		System.out.println("10.Exit\n");
		System.out.println("\n----------------------------------");
		System.out.println("Enter Your Choice:\t");
		for(Object X:list)
		{
			System.out.println(X);
		}
		
		int choice =in.nextInt();
		switch(choice)
		{
			case 1:System.out.println("\nEnter Value to Insert: "); 
					int value=in.nextInt();
					list.add(value);
					break;
			case 2:
					list.displayList();
					break;
			case 3:System.out.println("\nEnter positon to Insert(starts from 0):");
					int pos=in.nextInt();
					if(pos<0)
					{
						System.out.println("Invalid position");
					}
					System.out.println("\nEnter Value to Insert: "); 
					int val=in.nextInt();
					list.insertAtpos(pos,val);
					break;
			case 4:System.out.println("\nEnter position to delete:");
						pos=in.nextInt();
					if(pos<0)
					{
						System.out.println("Invalid positon");
					}
 				   		list.deleteAtpos(pos);
					break;
			case 5:	 
					list.deleteAtEnd();
					break;
			case 6: list.deleteBeginning();
					break;
			case 7:System.out.println("Enter Value to insert:\n");
					val=in.nextInt();
					list.insertBeginning(val);
					break;
			case 8: System.out.println("enter Value for index:\n");
					value=in.nextInt();
					list.getIndex(value);
					break;
			case 9:System.out.println("Enter value to Update: \n");
					value=in.nextInt();
					System.out.println("Enter Index to Update :\n");
					int index=in.nextInt();
					list.update(index,value);
					break;
			case 10 :System.exit(0);
					break;
			default:System.out.println("invalid Choice");
		}	
			
		}
	}

}
