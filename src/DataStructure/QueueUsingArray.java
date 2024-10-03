package DataStructure;

public class QueueUsingArray {
	static final int MAX_SIZE=30;
	int arr[]=new int[MAX_SIZE];
	int rear,front;
	QueueUsingArray()
	{
		rear=-1;
		front=-1;
	}
	public void enqueue(int val)
	{
		if(rear==MAX_SIZE-1)
		{
			throw new IndexOutOfBoundsException("Queue is full");
		}
		if(front==-1)
		{
			front++;
		}
		arr[++rear]=val;
	}
	public int dequeue()
	{
		if(rear==-1)
		{
			throw new IndexOutOfBoundsException("Queue is Empty");
		}
		int temp=arr[0];
		for(int i=1;i<=rear;i++)
		{
			arr[i-1]=arr[i];
		}
		rear--;
		return temp;
	}
}
