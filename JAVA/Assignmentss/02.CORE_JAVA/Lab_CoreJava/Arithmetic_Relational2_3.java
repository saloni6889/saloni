// Create a calculator using arithmetic and relational operators.

package Lab_CoreJava;

import java.util.Scanner;

public class Arithmetic_Relational2_3 {
	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter the Number : ");
		Scanner r=new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();
		System.out.println("Addition "+(a+b));
		System.out.println("Subtraction "+(a-b));
		System.out.println("Multipliction "+(a*b));
		System.out.println("Division "+(a/b));
		System.out.println("Reminder "+(a%b));
		System.out.println(" ");
		System.out.println("Relational Operators : ");
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a==b);
	}
}
