//3. WAP to Find Area And Circumference of Circle
#include<stdio.h>
main()
{
	float r,a,c;
	printf("enter the radius");
	scanf("%f",&r);
	a=3.14*r*r;
	c=3.14*2*r;
	printf("area=%f",a);//a=3.14*r*r
	printf("\n circumference=%f",c);//c=3.14*2*r
}
