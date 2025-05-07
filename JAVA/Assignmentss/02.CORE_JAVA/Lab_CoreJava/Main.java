import Lab_CoreJava.Greeting; // Importing the user-defined package

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.sayHello(); // Call the method from the Greeting class
    }
}

Lab_CoreJava;

public class Greeting {
    public void sayHello() {
        System.out.println("Hello from the Greeting class in Lab_CoreJava!");
    }
}

