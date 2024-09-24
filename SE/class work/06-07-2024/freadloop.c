#include<stdio.h>
main()
{

FILE* fptr;
fptr=fopen("test1.txt","r");
char a[100];
int i=0;
while(fgets(a,100,fptr)!='\0')
{
	
	printf("%s",a);
	i++;
}
fclose(fptr);
}
