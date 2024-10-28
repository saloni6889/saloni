//Implement a program that reads a file line by line using BufferedReader. 

package Lab_CoreJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffer_14_2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}
