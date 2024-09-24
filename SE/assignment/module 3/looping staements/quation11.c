//11. Accept 5 names from user at run time.
#include<stdio.h>
#include<string.h>
main()
{
	char name[5][12];
	int i;
	for(i=0;i<5;i++)
	{
	printf("enter the name:");
	scanf("%s",name[i]);
    }
    for(i=0;i<5;i++)
    {
    	printf("the name:%s\n",name[i]);
	}
}

