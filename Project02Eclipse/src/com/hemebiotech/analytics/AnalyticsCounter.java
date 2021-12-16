package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AnalyticsCounter {
	public static void main(String args[]) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How would you like to name the output file ? (default name : 'results.out') : ");
		String outputName = scanner.nextLine();
		Analyze analyze = new Analyze(new ReadSymptomDataFromFile("symptoms.txt"),
				new TreatSymptomDataFromFile(),
				new WriteResultsDataToFile(outputName));
		
		List<String> symptomsWithDuplicates = analyze.getSymptoms();
		Map<String, Integer> symptomsChecked = analyze.treatSymptoms(symptomsWithDuplicates);
		analyze.writeSymptoms(symptomsChecked);
		
		System.out.println("Output file name : "+analyze.writer.getFileName());
		scanner.close();
	}
		
}
