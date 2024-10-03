package codeio;

import java.util.Stack;

public class Collections {

	public static void main(String[] args) {
		
		Stack<Integer> stk=new Stack<>();
		stk.add(1);
		stk.add(2);
		stk.add(3);
		System.out.println(stk.peek());
		stk.pop();
		System.out.println(stk);

	}

}
