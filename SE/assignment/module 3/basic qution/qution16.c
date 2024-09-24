//16.Convert country’s name in abbreviate form.
#include<stdio.h>
main()
{
	int i,j=0,k;
	char name[30];
	printf("enter the country name:");
	gets(name);//input string
	int len=strlen(name);//length of string
	char short_name[len];
	for(k=0;k<=len/2;k++)
	{
		printf("%c",short_name[k]=name[k]);//store the half string in short_name
	}
}
