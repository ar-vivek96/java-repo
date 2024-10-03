package DataStructure;

public class QueueLinkedList {
	class Node
	{
		int data;
		Node next;
		Node(int val)
		{
			data=val;
			next=null;
		}
	}
	Node front,rear;
	QueueLinkedList()
	 {
		 front=null;
		 rear=null;
	 }
	
	public void enqueue(int val)
	{
		Node newNode=new Node(val);
		if(front==null)
		{
			front=newNode;
		}
		else {
		rear.next=newNode;
		rear=newNode;
		}
	}
	public int dequeue()
	{
		if(front==null)
		{
			throw new IndexOutOfBoundsException("1 ");
		}
		int temp=front.data;
		front=front.next;
		return temp;	
	}
	public boolean isEmpty()
	{
		return front==null;
	}
	public int elementAtfront()
	{
		if(front==null)
		{
			throw new IndexOutOfBoundsException();
		}
			return front.data;	
	}


	



}
