package Lab_CoreJava;
import java.util.ArrayList;
//Implement a program using HashSet to remove duplicate elements froma list. 

import java.util.HashSet;

public class RemoveDuplicat15_2 {
    public static void main(String[] args) {
        // Create a list with duplicate elements
        ArrayList<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Apple");
        listWithDuplicates.add("Banana");
        listWithDuplicates.add("Apple");
        listWithDuplicates.add("Cherry");
        listWithDuplicates.add("Banana");

        // Remove duplicates using HashSet
        HashSet<String> set = new HashSet<>(listWithDuplicates);
        
        // Convert to List
        ArrayList<String> listWithoutDuplicates = new ArrayList<>(set);

        // Print list without duplicates
        System.out.println("List without duplicates: " + listWithoutDuplicates);
    }
}
