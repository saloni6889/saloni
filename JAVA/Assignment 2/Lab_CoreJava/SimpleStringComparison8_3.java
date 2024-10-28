//Implement string comparison using equals() and compareTo() methods.

package Lab_CoreJava;

import java.util.Scanner;

public class SimpleStringComparison8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Using equals()
        System.out.println("Using equals(): " + str1.equals(str2));

        // Using compareTo()
        System.out.println("Using compareTo(): " + str1.compareTo(str2));
    }
}
