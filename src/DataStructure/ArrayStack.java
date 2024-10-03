package DataStructure;

public class ArrayStack<T> {
	static final int MAX_SIZE=30;
	T arr[]=(T[])new Object[MAX_SIZE];
	int  top;
	ArrayStack()
	{
		top=-1;
	}
	public void push(T val)
	{
		if(top==MAX_SIZE-1)
		{
			throw new IndexOutOfBoundsException("Stack is Full");
		}
		arr[++top]=val;
		
	}
	public T pop()
	{
		if(top==-1)
		{
			throw new IndexOutOfBoundsException("stack is empty");
		}
		return arr[top--];
	}
	public T peek()
	{
		return arr[top];
	}
	boolean isEmpty()
	{
		return (top==-1);
	}
}
