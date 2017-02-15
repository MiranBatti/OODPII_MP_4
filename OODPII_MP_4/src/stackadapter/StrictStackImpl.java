package stackadapter;

import java.util.LinkedList;
import java.util.List;

import exceptionHandlers.StrictStackEmptyException;

public class StrictStackImpl<T> implements StrictStack<T> 
{
	private List<T> elements;
	
	public StrictStackImpl() 
	{
		elements = new LinkedList<T>();
	}
	
	public StrictStackImpl (List<T> list)
	{
		this.elements = list;
	}
	
	@Override
	public void push(T element) 
	{
		elements.add(element);
	}

	@Override
	public T pop() throws StrictStackEmptyException
	{
		if(elements.isEmpty())
			throw new StrictStackEmptyException("Cannot remove from an empty stack");
		
		T removedElement = elements.remove(elements.size() - 1);
		
		return removedElement;
	}

	@Override
	public T top() 
	{
		if(elements.isEmpty())
			throw new StrictStackEmptyException("Cannot peek at an empty stack");
		return elements.get(elements.size() - 1);
	}

	@Override
	public boolean isEmpty()
	{
		return elements.isEmpty();
	}

	@Override
	public int count()
	{
		return elements.size();
	}

}
