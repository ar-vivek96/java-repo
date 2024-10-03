package DataStructure;

public class QueueArray {
	static final int MAX_SIZE=30;
	int arr[]=new int[MAX_SIZE];
	int front,rear;
	QueueArray()
	{
		front=-1;
		rear=-1;
	}

	public void enqueue(int val)
	{
		if(rear==MAX_SIZE-1)
		{
			throw new IndexOutOfBoundsException();
		}
		if(front==-1)
		{
			front++;
		}
		arr[++rear]=val;
	}
	public int dequeue()
	{
		try {
		if(front==-1||front>rear)
		{
			throw new IndexOutOfBoundsException();
		}}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return arr[front++];
	}
	

}
