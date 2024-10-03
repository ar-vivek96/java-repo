package DataStructure;

import java.beans.IndexedPropertyChangeEvent;
import java.util.Iterator;

import DataStructure.LinkedList.Node;

public class DoublyLinkedList<T> implements Iterable {
	Node head;
	Node tail;
	
	class Node
	{
		T data;
		Node next;
		Node prev;
		Node(T val)
		{
			data=val;
			next=null;
			 prev=null;
		}
		
	}
	
	DoublyLinkedList()
	{
		head=null;	
		tail=null;
		
	}
	public void insertAtBeginning(T val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			head.prev=newNode;
			newNode.next=head;
			head=newNode;
			
		}
	}
	public void display()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void displayRev()
	{
		Node temp=tail;
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
	}
	public void insertAtPos(int pos,T val)
	{
		Node newNode=new Node(val);
		Node temp=head;
		if(pos==0)
		{
			insertAtBeginning(val);
		}
		if(temp==null)
			throw new IndexOutOfBoundsException();
		for(int i=1;i<pos;i++)
		{
			temp=temp.next;
		}
			newNode.next=temp.next;
			newNode.prev=temp;
			if(temp==tail)
				tail=newNode;
			else 
			temp.next.prev=newNode;
			temp.next=newNode;
			
	}
	public void deleteAtPos(int pos)
	{
		Node temp=head;
		if(head==null)
		{
			throw new IndexOutOfBoundsException();
		}
			Node prev=null;
		for(int i=1;i<=pos;i++)
		{
			prev=temp;
			temp=temp.next;
		}
		if(temp==null)
		{
			throw new IndexOutOfBoundsException();
		}
		
		prev.next=temp.next;
		if(temp.next==null)
		{
			tail=prev;
		}
		else
		{
		temp.next.prev=prev;
		}
		
	}
	public void deleteAtBeginning() {
		if(head==null)
			tail=null;
		else
		{
			head.prev=null;
		}
	}
	public void deleteAtEnd() {
		Node temp=head;
		Node prev=null;
		while(temp!=null)
		{
			prev=temp;
			temp=temp.next;
			if(temp.next==null)
			{
				tail=prev;
			}
		}
		}
		
			
	public Iterator<T> iterator()
	{
		return new Iterator<T>(){
			Node temp=head;
			
		public boolean hasNext()
			{
				return temp!=null;
			}
			public T next ()
			{
				T val=temp.data;
				temp=temp.next;
				return val;
			}
		};
	}
}
