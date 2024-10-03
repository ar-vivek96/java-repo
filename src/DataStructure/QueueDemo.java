package DataStructure;

public class QueueDemo {

	public static void main(String[] args) {
		QueueArray q=new QueueArray();
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
