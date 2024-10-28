//Implement a file copy program using FileInputStream and FileOutputStream. 

package Lab_CoreJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInp_out16_2 {
    public static void main(String[] args) {
        String sourceFile = "source.txt"; 
        String destinationFile = "destination.txt"; 

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
