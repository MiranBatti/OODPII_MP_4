package tests;

import java.util.LinkedList;

import listdecorator.ListLogger;
import stackadapter.StrictStack;
import stackadapter.StrictStackImpl;

public class CombinationMain
{
	public static void main(String[] args)
	{
		StrictStack<String> stack = new StrictStackImpl<String>(new ListLogger<String>(new LinkedList<String>()));
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
	}
}
