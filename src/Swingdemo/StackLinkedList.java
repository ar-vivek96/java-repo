package Swingdemo;

public class StackLinkedList <T>{
	Node top;
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
	
	StackLinkedList()
	{
		top=null;
	}
	public void push(T val)
	{
		Node newNode=new Node(val);
		newNode.next=top;
		top=newNode;
	}
	public T pop()
	{
		if(top==null)
		{
			throw new IndexOutOfBoundsException();
		}
		
		T val=top.data;
		top=top.next;
		return val;
	}
	public T peek()
	{
		return top.data;
	}
	public boolean isEmpty()
	{
		return (top==null);
	}
	

}
