//37. WAP to show
//ii. Vowel or Consonant using switch case
#include<stdio.h>
main()
{
	char ch;
	printf("enter the character(A to Z or a to z):");
	scanf("%d",&ch);
	switch (ch)
	{
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			printf("vowel");
			break;
		default:printf("Consonant");
	}
}
