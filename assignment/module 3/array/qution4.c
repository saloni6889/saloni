//4. WAP to find factorial using recursion.
#include<stdio.h>
int fact(int a)
{
	int fact1;
	if(a==1)
	{
		return 1;
	}
		else
		{
			return (a*fact(a-1));
		}

}
9,17array
basic 17,32
loop 11
main()
{

  int n;
  printf("enter the num:");
  scanf("%d",&n);
  int fact1=fact(n);
  printf("%d",fact1);
}
