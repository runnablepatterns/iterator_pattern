package com.runnablepatterns.iteratorpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Interface used to group different MyDocument objects 
 * 
 */
public interface MyDocumentAggregate {
	
	/**
	 * Method to create an Iterator from the specific aggregate
	 * @return
	 */
	public Iterable createIterator();

}
