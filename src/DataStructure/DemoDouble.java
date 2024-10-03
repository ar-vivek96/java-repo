package DataStructure;

public class DemoDouble {

	public static void main(String[] args) {
		DoublyLinkedList<Integer> list=new DoublyLinkedList<>();
		list.insertAtBeginning(3);
		list.insertAtBeginning(4);
		list.insertAtBeginning(7);
		list.insertAtBeginning(9);
		list.display();
	System.out.println(" ");
		list.displayRev();
		System.out.println(" ");
		list.insertAtPos(3,2);
		list.display();
		System.out.println(" ");
		list.displayRev();  
		System.out.println(" ");
		list.deleteAtEnd();
		list.display();
 		System.out.println(" ");
		list.displayRev();
		
	}

}
