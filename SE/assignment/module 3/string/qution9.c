//9. Write a program in C to find the maximum number of characters in a string.
#include<stdio.h>#include<stdio.h>
main()
{
	char a[10];
	int i,l=0;
	
	printf("Enter a String : ");
	gets(a);  
	
	for(i=0;a[i]!='\0';i++)
	{
		if(a[i]==' ');	
		else		//count characters
			l++;
	}
	printf(" maximum Number of Characters in String = %d",l);
}
