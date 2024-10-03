package DataStructure;

public class DemoQueue {

	public static void main(String[] args) {
		QueueUsingArray q=new QueueUsingArray();
		q.enqueue(9);
		q.enqueue(10);
		q.enqueue(8);
		
		System.out.println("Dequeued "+q.dequeue());
		System.out.println("Dequeued "+q.dequeue());
		System.out.println("Dequeued "+q.dequeue());
		q.enqueue(1);
		q.enqueue(2);
		System.out.println("Dequeued "+q.dequeue());
		System.out.println("Dequeued "+q.dequeue());		

	}

}
