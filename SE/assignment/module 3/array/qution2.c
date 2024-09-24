//2.WAP of Addition, Subtraction, Multiplication and Division using Switch
//case.(Must Be Menu Driven).
#include<stdio.h>
main()
{
	int a,b;
	int op;
	printf("1.addition\n 2.subtraction\n 3.multiplication\n 4.division\n");
	printf("enter the value a & b:");
	scanf("%d%d",&a,&b);
	printf("enter your choice:");
	scanf("%d",&op);
	switch (op)
{
	
	case 1:
		printf("addition%d",a+b);
		break;
	case 2:
		printf("subtraction:%d",a-b);
		break;
	case 3:
		printf("multipliction:%d",a*b);
		break;
	case 4:
		printf("diivisiontion:%d",a/b);
		break;
	default:
		printf("enter your correct choice:");
		break;
	}
}
