package com.runnablepatterns.iteratorpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Interface used to handle Iterator methods for different aggregates (containers)
 * 
 */
public interface Iterable {
	
	/**
	 * Method to check if there are more items in the aggregate
	 * @return True if there are more items to check. False if no items are left
	 */
	public boolean hasNext();
	
	/**
	 * Get the next item inside the aggregate
	 * @return The next item
	 */
	public Object next();

}
