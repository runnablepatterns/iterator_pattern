package com.runnablepatterns.iteratorpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class that implements iterable interface used to create array iterator
 * 
 */
public class ArrayIterator implements Iterable {

	private MyDocument[] documents;
	private int position = 0;
	
	/**
	 * Overloaded constructor used to initialize array
	 * @param _documents
	 */
	public ArrayIterator(MyDocument[] _documents) {
		this.documents = _documents;
	}
	
	@Override
	public boolean hasNext() {
		// check if there are more items
		if(this.documents == null || this.documents.length == position || this.documents[position] == null) {
			return false;
		}
		
		return true;
	}

	@Override
	public Object next() {
		// get the current document
		MyDocument document = this.documents[position];
		
		// move the index
		position++;
		
		// return document
		return document;
	}

}
