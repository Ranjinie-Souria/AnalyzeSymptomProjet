package com.hemebiotech.analytics;

import java.util.Map;

/**
 * 
 * Interface to treat the data
 * 
 */
public interface ISymptomTreatment {
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return The map list of the symptoms name and their occurrence
	 */
	Map<String, Integer> treatSymptoms ();
}
