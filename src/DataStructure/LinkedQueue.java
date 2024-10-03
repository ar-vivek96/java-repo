package DataStructure;

public class LinkedQueue {

	public static void main(String[] args) {
	
		QueueLinkedList q=new QueueLinkedList();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		
		
		
	}

}
