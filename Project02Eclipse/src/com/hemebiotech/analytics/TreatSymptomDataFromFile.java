package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * Treating the data from a string List
 *
 */
public class TreatSymptomDataFromFile implements ISymptomTreatment {

	private List<String> symptomsWithDuplicates;
	
	/**
	 * The symptom list with duplicates
	 * 
	 * @param symptomsWithDuplicates The symptom list with duplicates
	 */
	public TreatSymptomDataFromFile (List<String> symptomsWithDuplicates) {
		this.symptomsWithDuplicates = symptomsWithDuplicates;
	}
	
	public TreatSymptomDataFromFile() {
		super();
	}

	public List<String> getListDuplicates() {
		return symptomsWithDuplicates;
	}
	
	/**
	 * The symptoms with their names and occurrences, sorted alphabetically
	 * 
	 * 
	 * @param symptomsWithDuplicates The list of symptoms with duplicates
	 * @return Returns the sorted map list of symptoms with their name and their occurrence
	 */
	@Override
	public Map<String, Integer> treatSymptoms(List<String> symptomsWithDuplicates) {
		this.symptomsWithDuplicates = symptomsWithDuplicates;
		Map<String, Integer> symptomsChecked = new TreeMap<String, Integer>();
		// Liste de symptôme (rhûme, mal de tête, mal au ventre, rhûme)
		for(String symptom : symptomsWithDuplicates) {
			if(symptomsChecked.containsKey(symptom)) {
				symptomsChecked.put(symptom, symptomsChecked.get(symptom)+1);
			}
			else {
				symptomsChecked.put(symptom, 1);
			}
			
		}
		
		return symptomsChecked;
	}
	
	

	
}