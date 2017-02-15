package stackadapter;

import java.util.ArrayList;
import java.util.List;

public class StackMain 
{
	public static void main(String[] args)
	{
		StrictStackImpl<String> stack = new StrictStackImpl<String>();
		
		System.out.println("The stack is empty: " + stack.isEmpty());
//		stack.pop(); //Will give us and exception
		stack.push("First element");
		stack.push("Second element");
		stack.push("Third element");
		stack.push("Fourth element");
		stack.push("Fifth element");
		System.out.println("We've removed the: " + stack.pop() + " from our stack.");
		System.out.println("The " + stack.top() + " is at the top of our stack.");
		System.out.println("There are " + stack.count() + " elements in our stack.\n\n\n");
		
		
		
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		StrictStack<Integer> arrayListStack = new StrictStackImpl<>(arrayList);
		arrayListStack.push(2);
		System.out.println("There are " + arrayListStack.count() + " elements in our stack.");
		System.out.println("We've removed the element nbr " + arrayListStack.pop() + " from our stack.");
	}
}
