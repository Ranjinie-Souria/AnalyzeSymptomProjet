package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * 
 * Treating the data from a string List
 *
 */
public class WriteResultsDataToFile implements ISymptomWriter {
	private Map<String, Integer> symptomsChecked;
	public String fileName;
	
	/**
	 * The symptom list with their occurrences
	 * 
	 * @param symptomsChecked The symptom list with their occurrences
	 */
	public WriteResultsDataToFile (Map<String, Integer> symptomsChecked) {
		this.symptomsChecked = symptomsChecked;
	}
	
	public WriteResultsDataToFile () {
		super();
	}

	public WriteResultsDataToFile(String fileName) {
		if(fileName != null && !fileName.isEmpty()) {
			this.fileName = fileName;			
		}
		else {
			this.fileName = "results.out";
		}
	}

	public String getFileName() {
		return fileName;
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
	public void writeSymptoms(Map<String, Integer> treatSymptoms) {
		this.symptomsChecked = treatSymptoms;
		if (fileName == null) {
			this.fileName = "results.out";			
		}
		else {
				try {
				FileWriter writer = new FileWriter (this.fileName);
				for (Map.Entry<String, Integer> entry : treatSymptoms.entrySet()) {
					String symptomName = entry.getKey();
					Integer symptomCount = entry.getValue();
					writer.write(symptomName+": " + symptomCount + "\n");
				}
				informUserOfSymptoms();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
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