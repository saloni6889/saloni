//2. Write a program in C to separate individual characters from a string.
#include<stdio.h>
#include<string.h>
main()
{
	char a[50];
	int i;
	printf("enter string:");
	gets(a);
		printf("enter character of string:");
	for(i=0;a[i]!='\0';i++)
	{
		if(a[i]=='0');
		else
		printf("\n%c",a[i]);
	}
}
