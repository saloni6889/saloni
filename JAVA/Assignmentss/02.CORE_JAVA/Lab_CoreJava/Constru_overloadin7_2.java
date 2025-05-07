//Demonstrate constructor overloading by passing different types of parameters. 

package Lab_CoreJava;

class Animaal {
    String name;

    Animaal(String name) {
        this.name = name;
    }

    Animaal() {
        this.name = "Unknown Animal"; 
    }

    void display() {
        System.out.println("Animal Name: " + name);
    }
}

public class Constru_overloadin7_2 {
    public static void main(String[] args) {
        Animaal animaal1 = new Animaal("Lion"); 
        Animaal animaal2 = new Animaal();           

        
        animaal1.display(); 
        animaal2.display(); 
    }
}
