//30. If bill exceeds Rs. 800 then a surcharge of 18% will be charged andthe
//minimum bill should be of Rs. 256/-.
#include<stdio.h>
main()
{
   int bill,subcharge;
   printf("enter the bill amount(minimum=256):");
   scanf("%d",&bill);
   if(bill>800)
   {
   	subcharge=bill*18/100;printf("total amount:%d",bill+subcharge);
	   }	
	   else if(bill>256 && bill<=800)
	   {
	   	printf("total amount:%d",bill);
	   }
	   else
	   {
	   	printf("enter the valid bill amount");;
	   }
}
