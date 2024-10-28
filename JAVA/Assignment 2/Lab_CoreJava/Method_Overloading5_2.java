//Implement method overloading by creating methods for different data types

package Lab_CoreJava;

class Method {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public String add(String a, String b) {
        return a + b;
    }
}

public class Method_Overloading5_2 {
    public static void main(String[] args) {
        Method example = new Method(); 
        System.out.println("Sum of two integers: " + example.add(10, 20)); 

        System.out.println("Sum of two doubles: " + example.add(10.5, 20.5)); 

        System.out.println("Sum of three integers: " + example.add(10, 20, 30)); 

        System.out.println("Concatenation of two strings: " + example.add("Hello, ", "World!")); 
    }
}
