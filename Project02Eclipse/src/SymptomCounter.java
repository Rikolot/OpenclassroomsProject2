package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/* New class to create a list named "symptoms" which will count and order all symtpoms */

public class SymptomCounter implements com.hemebiotech.analytics.IReference {

    private List<String> symptoms;


    public SymptomCounter (List <String> symptoms){
        this.symptoms = symptoms;
    }

    @Override
    public TreeMap<String, Integer> counterOccurrence() {
        TreeMap<String, Integer> result = new TreeMap<>() ;
        for (String symptom: symptoms){
            if( result.containsKey(symptom)){
                result.put(symptom, result.get(symptom) +1);
            }else{
                result.put(symptom, 1);
            }

        }
        return result;
    }
}