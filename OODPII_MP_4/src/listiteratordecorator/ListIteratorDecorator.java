package listiteratordecorator;

import java.util.ListIterator;

public abstract class ListIteratorDecorator<E> implements ListIterator<E>
{
	ListIterator<E> listIterator;
	
	public ListIteratorDecorator(ListIterator<E> listIterator)
	{
		this.listIterator = listIterator;
	}

	@Override
	public void add(E e)
	{
		listIterator.add(e);
	}

	@Override
	public boolean hasNext()
	{
		return listIterator.hasNext();
	}

	@Override
	public boolean hasPrevious()
	{
		return listIterator.hasPrevious();
	}

	@Override
	public E next()
	{
		return listIterator.next();
	}

	@Override
	public int nextIndex()
	{
		return listIterator.nextIndex();
	}

	@Override
	public E previous()
	{
		return listIterator.previous();
	}

	@Override
	public int previousIndex()
	{
		return listIterator.previousIndex();
	}

	@Override
	public void remove()
	{
		listIterator.remove();
	}

	@Override
	public void set(E e)
	{
		listIterator.set(e);
	}
}
