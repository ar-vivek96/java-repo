package DataStructure;

import java.lang.classfile.components.ClassPrinter.Node;
import java.util.Iterator;


public class LinkedList <T> implements Iterable<T>{

	Node head;
	class Node
	{
		T data;
		Node next;
		
		Node(T val)
		{
			data=val;
			next=null;
		}
		
	}
	LinkedList()
	{
		head=null;
	}
	public void insertAtBeginning(T val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
		
	}
	
	public void insertAtPos(int pos,T val)
	{
		Node newNode=new Node(val);
		Node temp=head;
		if(pos==0)
		{
			insertAtBeginning(val);
			return;
		}
		for(int i=1;i<pos;i++)
		{
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;
	}
	public void deleteAtPos(int pos)
	{
		
		if(head==null)
		{
			throw new IndexOutOfBoundsException();
		}
		Node temp=head;
		Node prev=null;
		
		for(int i=1;i<=pos;i++)
		{
			prev=temp;
			temp=temp.next;
		}
			prev.next=temp.next;	
	}
	public void deleteAtBeginning()
	{
		try {
		if(head==null)
		{
			
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
		head=head.next;
	}
	public void getIndex(int pos) {
		
	   Node temp=head;
	   if(pos==0)
	   {
		   System.out.println(head.data);
	   }
	   else {
	   for(int i=1;i<=pos;i++)
	   {
		   temp=temp.next;
	   }
	   System.out.println(temp.data);
	   }
	}
	public void update(int pos,T val) {
	
		Node temp=head;
		for(int i=1;i<=pos;i++)
		{
			temp=temp.next;
		}
		temp.data=val;
		
	}
	public void insertAtEnd(T val)
	{
		Node newNode=new Node(val);
		Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;      
	
	}
		
	public void deleteAtEnd()
	{
		Node prev=null;
		Node temp=head;
		while(temp.next!=null)
		{
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;
	}
		public void display()
		{

			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		
		}
		public void reverse()
		{
			Node prev=null;
			Node current=head;
			Node next=current.next;
			while(current!=null)
			{
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;
			}
			head=prev;
		}
		@Override
		public  Iterator<T> iterator()
		{
			return new Iterator<T>() {
				
				Node temp=head;
				public boolean hasNext()
				{
					return temp!=null;
				}
				public T next()
				{
					T val=temp.data;
					temp=temp.next;
					return val;
				}
			};
		}
		
}	