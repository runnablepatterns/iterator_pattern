package com.runnablepatterns.iteratorpatterndemo;

import com.runnablepatterns.iteratorpattern.ClientA;
import com.runnablepatterns.iteratorpattern.ClientB;
import com.runnablepatterns.iteratorpattern.MyDocumentAggregate;
import com.runnablepatterns.iteratorpattern.SaveMyDocument;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class used to demonstrates Iterator pattern
 * 
 */
public class IteratorPatternDemo {

	public static void main(String[] args) {
		// create client that uses ArrayList
		MyDocumentAggregate clientA = new ClientA();
		
		// create client that uses Array
		MyDocumentAggregate clientB = new ClientB();
		
		// create save service
		SaveMyDocument saveDocument = new SaveMyDocument();
		
		// save photos
		saveDocument.saveDocuments(clientA.createIterator());
		
		// save pdfs
		saveDocument.saveDocuments(clientB.createIterator());
	}

}
