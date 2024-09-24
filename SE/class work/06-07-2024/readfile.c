#include<stdio.h>
main()
{
	FILE*fptr;
	fptr=(fopen("test1.txt","r"));
	int a[100];
	fgets(a,100,fptr);
	fgets(a,100,fptr);
	printf("%s",a);
	fclose(fptr);
	
}
