package listiteratordecorator;

import java.util.ListIterator;
import java.util.logging.Logger;

import listdecorator.Loggable;

public class ListIteratorLogger<T> extends ListIteratorDecorator<T> implements Loggable
{
	private final Logger logger = logger();
	
	public ListIteratorLogger(ListIterator<T> listIterator)
	{
		super(listIterator);
	}

	@Override
	public void add(T e)
	{
		logger.finer("add(E e) [" + e.toString() + "]");
		super.add(e);
	}

	@Override
	public boolean hasNext()
	{
		boolean tmp = super.hasNext();
		logger.finer("hasNext() = " + tmp);
		return tmp;
	}

	@Override
	public boolean hasPrevious()
	{
		boolean tmp = super.hasPrevious();
		logger.finer("hasPrevious() = " + tmp);
		return tmp;
	}

	@Override
	public T next()
	{
		T tmp = super.next();
		logger.finer("next() = " + tmp.toString());
		return tmp;
	}

	@Override
	public int nextIndex()
	{
		int tmp = nextIndex();
		logger.finer("nextIndext() = " + tmp);
		return tmp;
	}

	@Override
	public T previous()
	{
		T tmp = super.previous();
		logger.finer("previous() = " + tmp);
		return tmp;
	}

	@Override
	public int previousIndex()
	{
		int tmp = previousIndex();
		logger.finer("previousIndex() = " + tmp);
		return tmp;
	}

	@Override
	public void remove()
	{
		logger.finer("remove()");
		super.remove();
	}

	@Override
	public void set(T e)
	{
		logger.finer("set(E e) [" + e + "]");
		super.set(e);
	}

}
