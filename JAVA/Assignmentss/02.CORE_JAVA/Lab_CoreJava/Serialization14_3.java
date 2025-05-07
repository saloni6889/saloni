//Create a program that demonstrates object serialization and deserialization.

package Lab_CoreJava;

import java.io.*;

class Personn implements Serializable {
    private static final long serialVersionUID = 1L; // Unique identifier for Serializable class
    private String name;
    private int age;

    public Personn(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class Serialization14_3 {
    public static void main(String[] args) {
        String filePath = "person.ser"; 
        Personn person = new Personn("mahima", 22);

        // Serialize object
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person);
            System.out.println("Serialized data is saved in " + filePath);
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }

        // Deserialize object
        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Personn deserializedPerson = (Personn) in.readObject();
            System.out.println("Deserialized Person: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        }
    }
}
