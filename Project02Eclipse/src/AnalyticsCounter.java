package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class AnalyticsCounter {


    public static void main(String args[]) throws Exception {
        /* List creation */

        com.hemebiotech.analytics.ISymptomReader symptomReader = new com.hemebiotech.analytics.ReadSymptomDataFromFile("symptoms.txt");
        List<String> symptoms = symptomReader.GetSymptoms();

        /* Result control */

			for (int i = 0; i < symptoms.size(); i++) {
			System.out.println(symptoms.get(i));
		}


    }
}
