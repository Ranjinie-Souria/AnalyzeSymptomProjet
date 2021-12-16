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
	 */
	@Override
	public Map<String, Integer> treatSymptoms(List<String> symptomsWithDuplicates) {
		this.symptomsWithDuplicates = symptomsWithDuplicates;
		Map<String, Integer> symptomsChecked = new TreeMap<String, Integer>();
				
		for (int i = 0; i < this.symptomsWithDuplicates.size(); i++) {
	    	symptomsChecked.put(this.symptomsWithDuplicates.get(i), numberOfSymptoms(this.symptomsWithDuplicates.get(i)));
	    }
		
		return symptomsChecked;
	}
	
	
	
	/**
	 * 
	 * Counts the number of times a certain typed symptom appears in a list
	 * 
	 * @param symptomEntered The name of the symptom
	 * @return Returns the numbers of time the symptom appears
	 */
	public Integer numberOfSymptoms(String symptomEntered) {
		int numberSymptom = 0;
		List<String> symptomList = this.symptomsWithDuplicates;
		for(String symptom : symptomList){
			if(symptom.equals(symptomEntered)) {
				numberSymptom++;
			}
		}
		return numberSymptom;
	}
	
}