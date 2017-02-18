package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import listdecorator.ListDecorator;
import listdecorator.ListLogger;
import listdecorator.ReversedList;

public class ListDecoratorMain
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		List<String> tinyList = new ArrayList<String>();
		tinyList.add("Added Element 1");
		tinyList.add("Added Element 2");
		
		ListDecorator<String> decoratedList = new ListLogger<String>(list);
		
		//Testing add() in ListLogger, and testing IteratorLogger
		for(int i = 0; i < 10; i++)
			decoratedList.add("Element " + i);

		decoratedList.add(10, "Element 10");
		decoratedList.get(3);
		decoratedList.indexOf("Element 5");
		decoratedList.contains("Element 10");
		decoratedList.containsAll(list);
		decoratedList.remove(10);
		decoratedList.isEmpty();
		
		System.out.println("\n");
		decoratedList.addAll(tinyList);
		for (String string : decoratedList)
			System.out.println(string);
		System.out.println("\n");
		
		//Testing ListIterator
		ListIterator<String> listIterator = decoratedList.listIterator();
		listIterator.hasNext();
		listIterator.next();
		listIterator.hasPrevious();
		listIterator.previous();
		
		//Testing ReveresedList
		System.out.println("\nReversedList:");
		ListDecorator<Integer> reversedList = new ReversedList<Integer>(list2);
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Add " + i);
			reversedList.add(i);
		}
		for (Integer integer : reversedList)
		{
			System.out.println("element " + integer);
		}
	}
}
