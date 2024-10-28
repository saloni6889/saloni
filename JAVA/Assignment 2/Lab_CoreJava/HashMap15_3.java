//Create a HashMap to store and retrieve key-value pairs

package Lab_CoreJava;

import java.util.HashMap;

public class HashMap15_3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put("Date", 4);
        System.out.println("Value for 'Apple': " + map.get("Apple"));
        System.out.println("Value for 'Banana': " + map.get("Banana"));
        System.out.println("Value for 'Cherry': " + map.get("Cherry"));
        System.out.println("Value for 'Date': " + map.get("Date"));
        System.out.println("\nComplete HashMap: " + map);
    }
}
