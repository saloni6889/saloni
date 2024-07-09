//14.Write a program in C to combine two strings manually.
#include<stdio.h>
#include<string.h>
main()
{
	char a[10],b[10];
	int i,j;
	printf("emter the string A:");
	gets(a);
	printf("enter the string B:");
	gets(b);
	for(i=0;a[i]!='\0';i++)
	for(j=0;b[j]!='\0';j++)	 
	{
		a[i]=b[j];
		i++;
	}
	a[i]='\0';
	
	printf("\nAfter Combine two Strings : %s",a);
}

