package com.hemebiotech.analytics;

import java.util.List;

/**
 * 
 * Interface to write the data
 * 
 */
public interface ISymptomWriter {
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */
	List<String> writeSymptoms ();
}
