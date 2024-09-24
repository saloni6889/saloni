//33. C Program to Read Integer and Print First Three Powers (N^1, N^2, N^3)
#include<stdio.h>
#include<math.h>
main()
{
	int n1;
	printf("enter the n1");
	scanf("%d",&n1);
	int r1=pow(n1,1);//n1^1
	int r2=pow(n1,2);//n1^2
	int r3=pow(n1,3);//n1^3
	printf("n^1:%d\n",r1);
	printf("n^2:%d\n",r2);
	printf("n^3:%d\n",r3);
}
	

