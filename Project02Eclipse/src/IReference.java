package com.hemebiotech.analytics;


import java.util.TreeMap;

/**
 * If no data is available, return an empty List
 *
 * @return a raw listing of all Symptoms obtained from GetSymptoms. There is no duplicate symptoms names.
 * If there are more than 1 symptom, it will be add at the same symptoms names.
 */

public interface IReference {

    TreeMap <String, Integer> counterOccurrence();

}
