package decorator;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListLogger<T> extends AbstractListDecorator<T> implements List<T>
{
	public ListLogger(List<T> list) 
	{
		super(list);
	}

	@Override
	public void add(int index, T element) {
//		System.out.println("Element " + index + " = " + element);
		System.out.println("add(int index, T element), index = " + index + ", element = " + element);
		super.add(index, element);
	}

	@Override
	public boolean add(T e) {
		boolean tmp = super.add(e);
		System.out.println("add(T e) = " + String.valueOf(tmp));
		
		return tmp;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		boolean tmp = super.addAll(c);
		System.out.println("addAll(Collection<? extends T> c) = " + tmp);

		return tmp;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		boolean tmp = super.addAll(index, c);
		System.out.println("addAll(int index, Collection<? extends T> c), index = " + index + ", c = " + c);
		
		return tmp;
	}

	@Override
	public void clear() {
		System.out.println("clear()");
		super.clear();
	}

	@Override
	public boolean contains(Object o) {
		boolean tmp = super.contains(o);
		System.out.println("contains(Object o) = " + tmp);
		return tmp;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		boolean tmp = super.containsAll(c);
		System.out.println("containsAll(Collection<?> c) = " + tmp);
		return tmp;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return super.get(index);
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return super.indexOf(o);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return super.isEmpty();
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return super.iterator();
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return super.lastIndexOf(o);
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return super.listIterator();
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return super.listIterator(index);
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return super.remove(index);
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return super.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return super.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return super.retainAll(c);
	}

	@Override
	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return super.set(index, element);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return super.size();
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return super.subList(fromIndex, toIndex);
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return super.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return super.toArray(a);
	}
	

}
