package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 * 
 * Reading the data from a filepath
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	public String filepath;
	
	/**
	 * 
	 * Filepath a full or partial path to file with symptom strings in it, one per line
	 * 
	 * @param filepath The filepath
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	public String getFilepath() {
		return filepath;
	}
	
	@Override
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		
		if (filepath == null) {
			this.filepath = "symptoms.txt";			
		}
		else {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	

}