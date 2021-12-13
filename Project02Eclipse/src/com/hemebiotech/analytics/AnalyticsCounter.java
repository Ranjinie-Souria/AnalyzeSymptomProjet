package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {
	public static void main(String args[]) throws Exception {
		
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> symptomsWithDuplicates = reader.getSymptoms();
		
		TreatSymptomDataFromFile treatment = new TreatSymptomDataFromFile(symptomsWithDuplicates);
		TreeMap<String, Integer> symptomsChecked = treatment.orderSymptoms(treatment.treatSymptoms());
		
		System.out.println(symptomsChecked);
		
	}
}
