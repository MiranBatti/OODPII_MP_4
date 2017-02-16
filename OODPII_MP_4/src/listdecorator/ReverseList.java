package listdecorator;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseList<T> extends ListDecorator<T> implements List<T>
{

	public ReverseList(List<T> list)
	{
		super(list);
	}

	@Override
	public void add(int index, T element)
	{
		super.add(index, element);
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

	@Override
	public boolean addAll(Collection<? extends T> c)
	{
		return super.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c)
	{
		return super.addAll(index, c);
	}

	@Override
	public void clear()
	{
		super.clear();
	}

	@Override
	public boolean contains(Object o)
	{
		return super.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c)
	{
		return super.containsAll(c);
	}

	@Override
	public T get(int index)
	{
		return super.get(index);
	}

	@Override
	public int indexOf(Object o)
	{
		return super.indexOf(o);
	}

	@Override
	public boolean isEmpty()
	{
		return super.isEmpty();
	}

	@Override
	public Iterator<T> iterator()
	{
		return super.iterator();
	}

	@Override
	public int lastIndexOf(Object o)
	{
		return super.lastIndexOf(o);
	}

	@Override
	public ListIterator<T> listIterator()
	{
		return super.listIterator();
	}

	@Override
	public ListIterator<T> listIterator(int index)
	{
		return super.listIterator(index);
	}

	@Override
	public T remove(int index)
	{
		return super.remove(index);
	}

	@Override
	public boolean remove(Object o)
	{
		return super.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c)
	{
		return super.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c)
	{
		return super.retainAll(c);
	}

	@Override
	public T set(int index, T element)
	{
		return super.set(index, element);
	}

	@Override
	public int size()
	{
		return super.size();
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex)
	{
		return super.subList(fromIndex, toIndex);
	}

	@Override
	public Object[] toArray()
	{
		return super.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a)
	{
		return super.toArray(a);
	}

}
