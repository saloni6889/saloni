//5. Write a program in C to compare two strings without using string library
//functions.
#include<stdio.h>
#include<string.h>
main()
{
	char a[20],b[20];
	int i,j;
	printf("enter the string A:");
	gets(a);
	printf("enter the string B:");
	gets(b);
	for(i=0;a[i]!='\0';i++)
	{
		if(a[i]=b[i])
	    	j=1;
		else
    	{
		    j=0;
	    	break;
    	}
    }
	if(j==1);
    	printf("\n string A and strings B are same string.");
	else
    	printf("\n string A and strings B are not same string.");

}
