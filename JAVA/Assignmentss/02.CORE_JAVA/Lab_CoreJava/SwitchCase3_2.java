//Implement a simple menu-driven program using a switch-case.

package Lab_CoreJava;

import java.util.Scanner;

public class SwitchCase3_2 {
	public static void main(String[] args) {
		int a=10,b=20 ,ch;
		System.out.println("Enter user choice :");
		Scanner r=new Scanner(System.in);
		ch=r.nextInt();
		switch(ch) {
		case 1:System.out.println("sum"+(a+b));
		break;
		case 2:System.out.println("sub"+(a-b));
		break;
		case 3:System.out.println("mul"+(a*b));
		break;
		case 4:System.out.println("div"+(a/b));
		break;
		default:System.out.println("Invalid choice");
		}
	}
}
