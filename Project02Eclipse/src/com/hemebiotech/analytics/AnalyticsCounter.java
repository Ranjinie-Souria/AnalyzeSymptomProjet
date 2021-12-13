package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	public static void main(String args[]) throws Exception {
		
		Analyze analyze = new Analyze(new ReadSymptomDataFromFile("symptoms.txt"),
				new TreatSymptomDataFromFile(),
				new WriteResultsDataFromFile());
		
		List<String> symptomsWithDuplicates = analyze.getSymptoms();
		Map<String, Integer> symptomsChecked = analyze.treatSymptoms(symptomsWithDuplicates);
		analyze.writeSymptoms(symptomsChecked);
		
	}
}
