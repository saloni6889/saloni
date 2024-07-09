#include<stdio.h>
main()
{
	char a[10],b[10],i,j;
	printf("enter string 1:");
	gets(a);
	printf("enter string 2:");
	gets(b);
	{
		for(i=0;a[i]!='\0';i++);
		for(j=0;b[j]!='\0';j++)
		{
		  a[i]=b[j];
		  i++;
		}
		a[i]='\0';
		printf("string coping is :%s",a);
	}
}
