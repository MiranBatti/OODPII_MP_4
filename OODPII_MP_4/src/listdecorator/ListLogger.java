package listdecorator;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Logger;

import iteratordecorator.IteratorLogger;
import listiteratordecorator.ListIteratorLogger;

public class ListLogger<T> extends ListDecorator<T> implements Loggable
{
	private final Logger logger = logger();
	
	public ListLogger(List<T> list) 
	{
		super(list);
	}

	@Override
	public void add(int index, T element) {
		logger.finer("add(int index, T element), index = " + index + ", element = " + element);
		super.add(index, element);
	}

	@Override
	public boolean add(T e) {
		boolean tmp = super.add(e);
		logger.finer("add(T e) = " + tmp);
		return tmp;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		boolean tmp = super.addAll(c);
		logger.finer("addAll(Collection<? extends T> c) = " + tmp);
		return tmp;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		boolean tmp = super.addAll(index, c);
		logger.finer("addAll(int index, Collection<? extends T> c), index = " + index + ", return value = " + c);
		return tmp;
	}

	@Override
	public void clear() {
		logger.finer("clear()");
		super.clear();
	}

	@Override
	public boolean contains(Object o) {
		boolean tmp = super.contains(o);
		logger.finer("contains(Object o) = " + tmp);
		return tmp;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		boolean tmp = super.containsAll(c);
		logger.finer("containsAll(Collection<?> c) = " + tmp);
		return tmp;
	}

	@Override
	public T get(int index) {
		T tmp = super.get(index);
		logger.finer("get(int index), index = " + index + ", return value = " + tmp.toString());
		return tmp;
	}

	@Override
	public int indexOf(Object o) {
		int tmp = super.indexOf(o);
		logger.finer("indexOf(Object o), " + o.toString() + ", index = " + tmp);
		return tmp;
	}

	@Override
	public boolean isEmpty() {
		boolean tmp = super.isEmpty();
		logger.finer("isEmpty = " + tmp);
		return tmp;
	}

	@Override
	public Iterator<T> iterator() {
		logger.finer("iterator()");
		return new IteratorLogger<T>(super.iterator());
	}

	@Override
	public int lastIndexOf(Object o) {
		int tmp = super.lastIndexOf(o);
		logger.finer("lastIndexOf() = " + tmp);
		return tmp;
	}

	@Override
	public ListIterator<T> listIterator() {
		logger.finer("listIterator()");
		return new ListIteratorLogger<T>(super.listIterator());
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		logger.finer("listIterator(int index)");
		return new ListIteratorLogger<T>(super.listIterator(index));
	}

	@Override
	public T remove(int index) {
		T tmp = super.remove(index);
		logger.finer("remove(int index) = " + tmp.toString());
		return tmp; 
	}

	@Override
	public boolean remove(Object o) {
		boolean tmp = super.remove(o);
		logger.finer("remove(Object o) = " + tmp);
		return tmp;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		logger.finer("removeAll(Collection<?> c)");
		return super.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		logger.finer("retainAll(Collection<?> c)");
		return super.retainAll(c);
	}

	@Override
	public T set(int index, T element) {
		T tmp = super.set(index, element);
		logger.finer("set(int index, T element) = " + tmp.toString());
		return tmp;
	}

	@Override
	public int size() {
		int tmp = super.size();
		logger.finer("size() = " + tmp);
		return tmp;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		logger.finer("subList(int fromIndex)");
		return super.subList(fromIndex, toIndex);
	}

	@Override
	public Object[] toArray() {
		logger.finer("toArray()");
		return super.toArray();
	}

	@SuppressWarnings("hiding")
	@Override
	public <T> T[] toArray(T[] a) {
		logger.finer("toString(T[] a)");
		return super.toArray(a);
	}
	

}
