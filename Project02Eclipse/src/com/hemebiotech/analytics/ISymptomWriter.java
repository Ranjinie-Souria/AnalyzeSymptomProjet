package com.hemebiotech.analytics;

import java.util.Map;

/**
 * 
 * Interface to write the data
 * 
 */
public interface ISymptomWriter {
	/**
	 * Writes the results
	 * 
	 * @param treatSymptoms The results to write
	 */
	void writeSymptoms(Map<String, Integer> treatSymptoms);
}
