package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * 
 * Interface to treat the data
 * 
 */
public interface ISymptomTreatment {
	/**
	 * The map list of the symptoms name and their occurrence
	 * 
	 * @return The map list of the symptoms name and their occurrence
	 */
	Map<String, Integer> treatSymptoms (List<String> symptomsWithDuplicates);
}
