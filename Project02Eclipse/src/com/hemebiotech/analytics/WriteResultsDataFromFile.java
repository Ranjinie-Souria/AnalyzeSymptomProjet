package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * 
 * Treating the data from a string List
 *
 */
public class WriteResultsDataFromFile implements ISymptomWriter {
	private Map<String, Integer> symptomsChecked;
	
	/**
	 * The symptom list with their occurrences
	 * 
	 * @param symptomsChecked The symptom list with their occurrences
	 */
	public WriteResultsDataFromFile (Map<String, Integer> symptomsChecked) {
		this.symptomsChecked = symptomsChecked;
	}
	
	public Map<String, Integer> getSymptomsAndOccurrences() {
		return symptomsChecked;
	}
	
	/**
	 * 
	 * Writes the result.out file
	 * 
	 */
	@Override
	public void writeSymptoms() {
		try {
			FileWriter writer = new FileWriter ("result.out");
			for (Map.Entry<String, Integer> entry : this.symptomsChecked.entrySet()) {
				String symptomName = entry.getKey();
				Integer symptomCount = entry.getValue();
				writer.write(symptomName+": " + symptomCount + "\n");
			}
			
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * Informs the user about the number of occurences of all symptoms
	 */ 
	public void informUserOfSymptoms() {
		for (Map.Entry<String, Integer> entry : this.symptomsChecked.entrySet()) {
			String symptomName = entry.getKey();
			Integer symptomCount = entry.getValue();
			System.out.println("There's "+symptomCount+" symptoms of '"+symptomName+"'.");
		}
		
	}

}