package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Analyze {
	
	private ISymptomReader reader;
	private ISymptomTreatment treatment;
	private ISymptomWriter writer;
	
	public Analyze(ISymptomReader reader, ISymptomTreatment treatment, ISymptomWriter writer) {
		this.reader = reader;
		this.treatment = treatment;
		this.writer = writer;
	}

	public List<String> getSymptoms(){
		return this.reader.getSymptoms();
	}
	
	public Map<String, Integer> treatSymptoms(List<String> listWithDuplicates){
		return this.treatment.treatSymptoms(listWithDuplicates);
	}
	
	public void writeSymptoms(Map<String, Integer> treatSymptoms){
		this.writer.writeSymptoms(treatSymptoms);
	}
	
	
	
}
