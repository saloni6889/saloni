//7. WAP Find out length of string without using inbuilt function.
#include<stdio.h>
main()
{
	char str[50];
	int i,length=0;
	printf("enter the string:");
	gets(str);
	for(i=0;str[i]!='\0';i++)
	{
		length++;
	}
	printf("enter the length string: %d",length);
}
