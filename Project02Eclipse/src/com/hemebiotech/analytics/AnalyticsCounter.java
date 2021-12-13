package com.hemebiotech.analytics;

import java.util.List;

public class AnalyticsCounter {
	public static void main(String args[]) throws Exception {
		
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> symptomsWithDuplicates = reader.getSymptoms();
		
		
	}
}
