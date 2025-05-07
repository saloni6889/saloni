//Write a program to find if a number is even or odd using an if-else statement

package Lab_CoreJava;

import java.util.Scanner;

public class odd_even3_1 {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the Number :");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
	    if(n%2==0) {
			System.out.println("the Number is even :");
		}
		else {
			System.out.println("the Number is odd");
		}
	}
}
