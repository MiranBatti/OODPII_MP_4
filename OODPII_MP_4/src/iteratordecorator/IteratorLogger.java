package iteratordecorator;

import java.util.Iterator;
import java.util.logging.Logger;

import listdecorator.Loggable;

public class IteratorLogger<T> extends IteratorDectorator<T> implements Loggable
{
	private final Logger logger = logger();
	private int counter = 0;

	public IteratorLogger(Iterator<T> iterator)
	{
		super(iterator);
	}

	@Override
	public boolean hasNext()
	{
		boolean tmp = super.hasNext();
		logger.finer("hasNext() = " + tmp);
		return tmp;
	}

	@Override
	public T next()
	{
		T tmp = super.next();
		logger.finer("next() [" + ++counter + "]");
		return tmp;
	}

}
