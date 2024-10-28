//Implement multiple catch blocks for different types of exceptions.

package Lab_CoreJava;

public class MultipleCatch_12_2 {
	public static void main(String[] args) {
		try {
			int a=10 , b=0, c;
			c=a/b;
			System.out.println(c);
			int arr[]= {10,20,30};
			System.out.println(arr[4]);
			String str=null;
			System.out.println(str.toUpperCase());
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Array Excepetion");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		catch(NumberFormatException n) {
			System.out.println("Number Exception");
		}
	catch(Exception x) {
		System.out.println("All type Exception handle");
	  }
   }
}
