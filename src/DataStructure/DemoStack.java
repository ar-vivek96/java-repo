package DataStructure;

public class DemoStack {

	public static void main(String[] args) {

		ArrayStack<Integer> stack=new ArrayStack<Integer>();
		stack.push(1);
		stack.push(9);
		
		System.out.println("poped "+stack.pop());
		stack.peek();
		System.out.println("peek "+stack.peek());
		
		System.out.println(stack.isEmpty());
		
		
	}

}
