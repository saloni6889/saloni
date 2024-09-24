//19.Calculate compound interest. A=P(1+R/100)^n , ci=A-P
#include<stdio.h>
#include<math.h>
main()
{
	int P,R,N,CI;
	printf("enter the principle amount:");
	scanf("%d",&P);
	printf("enter the rate:");
	scanf("%d",&R);
	printf("enter the num of year:");
	scanf("%d",&N);
	int amount=P*((float)(1+(float)R/100));
	int final_amount=pow(amount,N);
	printf("%d\n",final_amount);
	CI=final_amount-P;
	printf("compound interset is:%d",CI);
}
