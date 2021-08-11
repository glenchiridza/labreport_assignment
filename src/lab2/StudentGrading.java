package lab2;

import java.text.Normalizer;
import java.util.Formatter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by glenc on Aug 2021
 **/
public class StudentGrading {
    public static void main(String[] args) {
        System.out.println("Student class positions");
        Map<String, Integer> grading = new HashMap<>();
        grading.put("Tenday",10);
        grading.put("Bryan",8);
        grading.put("Getrude",1);
        grading.put("Wendy",3);
        grading.put("Michael",4);
        grading.put("Faith",5);

        LinkedHashMap<String,Integer> sortedGrade  = new LinkedHashMap<>();
        grading.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(n -> sortedGrade.put(n.getKey(),n.getValue()));

        System.out.println(sortedGrade);


    }
}
