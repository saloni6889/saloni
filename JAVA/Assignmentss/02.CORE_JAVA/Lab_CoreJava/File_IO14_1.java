//Write a program to read and write content to a file using FileReader and
//FileWriter

package Lab_CoreJava;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO14_1 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hello, World!");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
        try (FileReader reader = new FileReader("output.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        }
    }
}
