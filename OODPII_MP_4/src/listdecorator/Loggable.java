package listdecorator;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public interface Loggable
{
	default Logger logger()
	{
		Logger logger = Logger.getLogger(this.getClass().getName());
		logger.setLevel(Level.FINER);
		
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.FINER);
        logger.addHandler(handler);
				
		return logger;
	}
	
}
