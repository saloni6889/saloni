//Create a program to reverse a string and check for palindromes

package Lab_CoreJava;

public class String_Palindrom8_2 {
	public static void main(String[] args) {
		String s="Saloni";
		String rev="";
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not a Palindrome String");
		}
	}
}
