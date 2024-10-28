package Lab_CoreJava;

import MyPackage.Greeting; // Importing the user-defined package

public class Package11_1 {
    public static void main(String[] args) {
        Greeting11_1 greeting = new Greeting11_1(); // Create an instance of Greeting from MyPackage
        greeting.sayHello(); // Call the method from Greeting
    }
}
