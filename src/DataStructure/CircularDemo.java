package DataStructure;

public class CircularDemo {

	public static void main(String[] args) {
		 CicularLinkedList<String> list=new  CicularLinkedList<>();
		 list.insertAtBeginning("vivek");
		 list.insertAtBeginning("anbu");
		 list.insertAtBeginning("rani");
		 list.insertAtEnd("vijay");
		 list.display();
		 System.out.println(" ");
		 list.deleteAtBeginning();
		 list.display();
		 System.out.println("");
		 list.deleteAtEnd();
		 list.display();
		 
	}

}
