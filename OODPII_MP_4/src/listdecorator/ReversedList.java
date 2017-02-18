package listdecorator;

import java.util.List;

public class ReversedList<T> extends ListDecorator<T> implements List<T>
{

	public ReversedList(List<T> list)
	{
		super(list);
	}
	
	@Override
	public boolean add(T e)
	{
		super.add(0, e);
		if(list.contains(e))
			return true;
		else
			return false;
	}
}
