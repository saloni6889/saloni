package Lab_CoreJava;

import java.util.Scanner;

public class Console16_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
