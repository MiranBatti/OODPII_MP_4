package stackadapter;

public interface StrictStack<T> 
{
	public T pop();
	public T top();
	public boolean isEmpty();
	public int count();
	public void push(T e);
}
