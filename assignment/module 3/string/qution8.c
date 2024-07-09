//8. Write a program in C to count the total number of vowels or consonants in a
//string.
#include<stdio.h>
#include<string.h>
main()
{
	char a[10];
	int i,c=0,v=0;
	printf("enter string:");
	gets(a);
	for(i=0;a[i]!='\0';i++)
	{
		if(a[i]=='0');
		else if(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'||a[i]=='a'||a[i]=='e'||a[i]=='o'||a[i]=='i'||a[i]=='u')
			v++;
		    	else
			       c++;
	}
	printf("\num vowel string%d:",c);
	printf("\num cosonants string%d:",v);
}
