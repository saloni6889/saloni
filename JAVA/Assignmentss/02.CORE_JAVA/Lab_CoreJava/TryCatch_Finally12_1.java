//Write a program to demonstrate exception handling using try-catch-finally

package Lab_CoreJava;

public class TryCatch_Finally12_1 {
	public static void main(String[] args) {
		try {
			System.out.println("Learn Coding");
			int a=20,b=2,c;
			c=a/b;
			System.out.println(c);
			System.out.println("Like Share");
		    }
			catch(ArithmeticException a) {
				System.out.println("Can't devide by Zero");
			}
			finally {
				System.out.println("Subscribe");
			}
			System.out.println("Main Method Ended");
		}
	}

