#include<stdio.h>
main()
{
	char a[4],b[4];
	printf("enter string 1:");
	gets(a);
	printf("enter string 2:");
	gets(b);
	int c=strcmp(a,b);
	printf("%d",c);
	
}
