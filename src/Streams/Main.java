package Streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Kotlin");
        languages.add("Basic");

        /**List<String> filterList;
            for(String language: languages) {
               if(language.startsWith("P") || language.startsWith("J")) {
                  filterList.add(language);
                }
           }
        filterList = languages.stream() .filter(s -> s.startsWith("J") || s.startsWith("P")).collect(Collectors.toList());

        System.out.println("Filter List "+ filterList);

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(12);
        numbersList.add(13);
        numbersList.add(14);

        Set<Integer> sqaureSet = new HashSet<>();

        for(Integer number: numbersList) {
            sqaureSet.add(number * number);
        }

        sqaureSet = numbersList.stream().map(i -> i * i).collect(Collectors.toSet());
        System.out.println("Sqaures of the numbers : "+ sqaureSet);*/

        List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        System.out.println("Printing each element of the list.");
        languages.forEach(y -> System.out.println("Element : "+ y));
    }
}
