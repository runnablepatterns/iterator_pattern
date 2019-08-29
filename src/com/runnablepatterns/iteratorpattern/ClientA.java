package com.runnablepatterns.iteratorpattern;

import java.util.ArrayList;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class to handle ClientA request to save documents.
 * 
 */
public class ClientA implements MyDocumentAggregate {
	
	/**
	 * Variable to store all photos
	 */
	private ArrayList<MyDocument> documents = new ArrayList<>();
	
	/**
	 * Default constructor used to fill the array list
	 */
	public ClientA() {
		this.documents.add(new MyDocument("PhotoA.png", "PNG"));
		this.documents.add(new MyDocument("PhotoB.png", "PNG"));
		this.documents.add(new MyDocument("PhotoC.png", "PNG"));
	}

	@Override
	public Iterable createIterator() {
		// get the specific iterator for array list
		return new ArrayListIterator(this.documents);
	}

}
