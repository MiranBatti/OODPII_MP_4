package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import listdecorator.ListDecorator;
import listdecorator.ListLogger;
import listdecorator.ReverseList;

public class ListDecoratorMain
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		ListDecorator<String> decoratedList = new ListLogger<String>(list);
		
		for(int i = 0; i < 10; i++)
			decoratedList.add("Element " + i);
		for (String string : decoratedList)
			System.out.println(string);
		
		decoratedList.get(3);
		decoratedList.indexOf("Element 5");
		
		
		ListIterator<String> listIterator = decoratedList.listIterator();
		listIterator.next();
		listIterator.previous();
		listIterator.hasNext();
		listIterator.hasPrevious();
		
		ListDecorator<Integer> reversedList = new ReverseList<Integer>(list2);
		reversedList.add(1);
		reversedList.add(2);
		reversedList.add(3);
		for (Integer integer : reversedList)
		{
			System.out.println(integer);
		}
	}
}
