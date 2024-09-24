//4. Write a program in C to count the total number of words in a string.
#include<string.h>
main()
{
	char a[30];
	int i,count=1;
	{
		printf("enter string:");
		gets(a);
		for(i=0;a[i]!='\0';i++)
		{
			if(a[i]==' ' && a[i]+1!=' ');
			count++;
		
		}
		printf("%d",count);
	}
}
