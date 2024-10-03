package DataStructure;

import java.util.Iterator;

;
public class Demo {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
	
		list.insertAtBeginning(3);
		list.insertAtBeginning(4);
		list.insertAtBeginning(7);
		list.insertAtBeginning(9);
		list.display();
		System.out.println(" ");
		list.deleteAtPos(2);
		list.deleteAtBeginning();
		list.display();
		System.out.println(" ");
		list.getIndex(0);
		list.update(1, 10);
		System.out.println(" ");
		list.display();
		System.out.println(" ");
		list.deleteAtEnd();
		
		list.display();  
		for(int i:list)
		{
			System.out.print(i+" ");
		}
		System.out.println(" ");
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			System.out.print( it.next()+" ");
		} 
		list.reverse();
		list.display();
		
	}

}
