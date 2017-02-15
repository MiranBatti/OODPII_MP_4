package decorator;

import java.util.ArrayList;
import java.util.List;

public class ListDecoratorMain
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		
		AbstractListDecorator<String> v = new ListLogger<>(list);
		
		v.add("element 0");
		v.add(0, "element 1");
	}
}
