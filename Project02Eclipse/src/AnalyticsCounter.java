package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class AnalyticsCounter {


    public static void main(String args[]) throws Exception {
        /* List creation */

        ISymptomReader symptomReader = new ReadSymptomDataFromFile("symptoms.txt");
        List<String> symptoms = symptomReader.GetSymptoms();

        /* Result control */

			for (int i = 0; i < symptoms.size(); i++) {
			System.out.println(symptoms.get(i));
		}
        IReference reference = new SymptomCounter(symptoms);
        TreeMap<String, Integer> orderedSymptomsMap = reference.counterOccurrence();

        for (Map.Entry mapentry : orderedSymptomsMap.entrySet()) {

            System.out.print("Symptom: " + mapentry.getKey() + " - occurrence: " + mapentry.getValue() + "\n");
        }
    }
}
