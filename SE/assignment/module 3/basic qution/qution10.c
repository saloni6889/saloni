//10.find the area of a rectangular prism formula : A=2(wl+hl+hw)
#include<stdio.h>
main()
{
	float weight,length,height;
	printf("enter the area of ractangular:");
	scanf("%f",&weight);
	printf("enter the area of ractangular:");
	scanf("%f",&length);
	printf("enter the area of ractangular:");
	scanf("%f",&height);
	float A=2*(weight*length+height*length+height*weight);
	printf("R=%.2f",A);//ractangle prism a=2*(wl+hl+hw)
}

