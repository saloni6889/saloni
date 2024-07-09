//22. Accept 3 numbers from user using while loop and check each numbers
//palindrome.
#include <stdio.h>
int main() 
{
  int n1, reversed = 0, remainder, original;
    printf("Enter an integer: ");
    scanf("%d", &n1);
    original = n1;

    // reversed integer is stored in reversed variable
    while (n1 != 0)
	 {
        remainder = n1 % 10;
        reversed = reversed * 10 + remainder;
        n1 /= 10;
    }

    // palindrome if orignal and reversed are equal
    if (original == reversed)
        printf("%d is a palindrome.", original);
    else
        printf("%d is not a palindrome.", original);
        
		
		int n2;
    printf("Enter an integer: ");
    scanf("%d", &n2);
    original = n2;

    // reversed integer is stored in reversed variable
    while (n2 != 0)
	 {
        remainder = n2 % 10;
        reversed = reversed * 10 + remainder;
        n2 /= 10;
    }

    // palindrome if orignal and reversed are equal
    if (original == reversed)
        printf("%d is a palindrome.", original);
    else
        printf("%d is not a palindrome.", original);
        
        
        int n3;
    printf("Enter an integer: ");
    scanf("%d", &n3);
    original = n3;

    // reversed integer is stored in reversed variable
    while (n3 != 0)
	 {
        remainder = n3 % 10;
        reversed = reversed * 10 + remainder;
        n3 /= 10;
    }

    // palindrome if orignal and reversed are equal
    if (original == reversed)
        printf("%d is a palindrome.", original);
    else
        printf("%d is not a palindrome.", original);
	}
