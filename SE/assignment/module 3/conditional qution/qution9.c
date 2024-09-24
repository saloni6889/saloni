//9. C Program to Check Uppercase or Lowercase or Digit or Special
//Character
#include<stdio.h>
main()
{
	char n1;
	printf("enter the num:");
	scanf("%c",&n1);
	if (n1>='A' && n1<='Z')
	{
		printf("uppercase:");
	}
	else if(n1>='a' && n1<='z')
	{
		printf("lowercase:");
	}
	else if (n1<=0 && n1>=9)
	{
		printf("digits:");
	}
	else
	{
		printf("special char:");
	}
}
