//Create a program that reads from one file and writes the content to another file

package Lab_CoreJava;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy16_3 {
    public static void main(String[] args) {
        String sourceFile = "source.txt"; 
        String destinationFile = "destination.txt"; 

        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destinationFile)) {

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
