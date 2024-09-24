//7. Write a program in C to copy one string to another string.
#include<stdio.h>
#include<string.h>
main()
{
	char a[10],b[10];
	printf("enter string:");
	gets(a);
	strcpy(b,a);
	printf("\n string for A is:%s",a);
	printf("\n string for B is:%s",b);
}
