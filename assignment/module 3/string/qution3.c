//3. Write a program in C to print individual characters of a string in reverse order.
#include<stdio.h>
main()
{
	char a[20];
	int i=0;
	printf("enter string:");
	gets(a);
	for(i=0;a[i]!='\0';i++)
	i++;
	printf("enter the character of string");
	for(i=1;i>=0;i--)
	{
		if(a[i]=='0');
		else
		printf("\n%c",a[i]);
	}
}
