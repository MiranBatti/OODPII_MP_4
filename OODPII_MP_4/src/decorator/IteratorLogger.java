package decorator;

import java.util.Iterator;
import java.util.logging.Logger;

public class IteratorLogger<T> extends IteratorDectorator<T> implements Iterator<T>, Loggable
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
