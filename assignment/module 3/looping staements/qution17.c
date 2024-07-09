//17.Calculate 5 numbers from user and calculate number of even and odd using
//of while loop.
#include<stdio.h>
main()
{
	int i,num[5],n_even=0,n_odd=0;
	for(i=0;i<5;i++)
	printf("enter the num zero:");
	scanf("%d",&num[i]);

for(i=0;i<5;i++)
{
	if(num[i]%2==0)
	{
	n_even++;
    }
else
{
	n_odd++;
}
}
printf("\n odd num:%d",n_odd);
printf("\n even num:%d",n_even);
}
