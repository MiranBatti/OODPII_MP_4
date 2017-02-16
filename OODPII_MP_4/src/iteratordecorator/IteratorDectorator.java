package iteratordecorator;

import java.util.Iterator;

public abstract class IteratorDectorator<E> implements Iterator<E>
{
	Iterator<E> iterator;
	
	public IteratorDectorator(Iterator<E> iterator)
	{
		this.iterator = iterator;
	}

	@Override
	public boolean hasNext()
	{
		return iterator.hasNext();
	}

	@Override
	public E next()
	{
		return iterator.next();
	}
}
