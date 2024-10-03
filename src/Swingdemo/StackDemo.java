package Swingdemo;

public class StackDemo {

	public static void main(String[] args) {
		
		StackLinkedList<Integer> list=new StackLinkedList<>();
		list.push(3);
		list.push(9);
		list.push(8);
		list.push(2);
		System.out.println("poped "+list.pop());
		System.out.println("pop "+list.pop());
		System.out.println(list.isEmpty());
		System.out.println(list.peek());
	}

}
