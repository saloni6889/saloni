//Create a class with static variables and methods to demonstrate their use.
package Lab_CoreJava;

class Simple {
	
    static int count = 0;
    static void increaseCount() {
        count++;
    }
}

public class StaticVariable_demonstrat5_3 {
    public static void main(String[] args) {
        // Increase count
        Simple.increaseCount();
        Simple.increaseCount();

        System.out.println("Count: " + Simple.count); 
    }
}
