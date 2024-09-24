#include<stdio.h>
union
{
	int a[4];
	int b[4];
	int i;
}s1,s2,s3;
main()
{
	for(s3.i=0;s3.i<4;s3.i++)
	{
    	scanf("%d",&s1.a[s3.i]);
    }
    printf("enter the array element:");
    for(s3.i=0;s3.i<4;s3.i++)
	{
    	scanf("%d",&s2.b[s3.i]);
    }
    printf("sum of::");
    for(s3.i=0;s3.i<4;s3.i++)
	{
    	printf("%d\n",s1.a[s3.i]+s2.b[s3.i]);
    }
}
