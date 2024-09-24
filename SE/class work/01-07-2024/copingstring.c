#include<stdio.h>
main()
{
	int a[10],b[10],i;
	printf("enter string:");
	gets(a);
	{
		for(i=0;a[i]!='\0';i++)
        {
        	b[i]=a[i];
		}
		b[i]='\0';
	}
	printf("\n copy string is %s",b);
}
