//15.Convert school’s name in abbreviated form.
#include<stdio.h>
main()
{
	char name[]="Rastra Bharti Hindi High School";
	int i,j=0,k;
	int len=strlen(name);
	char short_name[len];//lengthof string
	short_name[0]=name[0];//insert first charachter to new string variable
	printf("%c",short_name[0]);
	for(i=1;i<len;i++)
	{
		if(name[i]==' ')
		{
		short_name[j++]=name[i+1];
	}	
}
//print short name
for(k=0;k<j;k++)
{
	printf("%c",short_name[k]);
}
}
