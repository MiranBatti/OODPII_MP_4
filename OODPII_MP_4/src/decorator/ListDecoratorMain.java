package decorator;

import java.util.ArrayList;
import java.util.List;

public class ListDecoratorMain
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		
		ListDecorator<String> decoratedList = new ListLogger<String>(list);
		
		for(int i = 0; i < 10; i++)
			decoratedList.add("Element " + i);
		for (String string : decoratedList)
			System.out.println(string);
	}
}
