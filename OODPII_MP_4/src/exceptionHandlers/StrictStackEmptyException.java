package exceptionHandlers;

public class StrictStackEmptyException extends RuntimeException
{
		public StrictStackEmptyException(String message) 
		{
			super(message);
		}
}
