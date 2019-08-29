package com.runnablepatterns.iteratorpattern;

import java.util.ArrayList;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class that implements Iterable interface used to create ArrayList iterator
 * 
 */
public class ArrayListIterator implements Iterable {

	private ArrayList<MyDocument> documents;
	private int position = 0;
	
	/**
	 * Overloaded constructor used to initialize array list
	 * @param _documents
	 */
	public ArrayListIterator(ArrayList<MyDocument> _documents) {
		this.documents = _documents;
	}
	
	@Override
	public boolean hasNext() {
		// check the current list state and if the array was finished
		if(this.documents == null || this.documents.size() == position) {
			return false;
		}
		
		return true;
	}

	@Override
	public Object next() {
		// get current document
		MyDocument document = this.documents.get(position);
		
		// move the index
		position++;
		
		// return document
		return document;
	}

}
