#include<stdio.h>
main()
{
	int choice, original;
	printf("\n****welcome to the game*****\n");
	while(1)
{
   printf("\n*****gusse the num betweeen 1 to 50*****\n");
   printf("\nenter the num between 1 to 50:\n");
   scanf("%d",&choice);
if(choice==original)
{
printf("you are win");
break;
}
else if(choice>50)
{
	printf("invalid choice");
}
else if(choice<original)
{
	printf("\n%d is less then original num:\n",choice);
}
else if(choice>original)
{
	printf("\n%d is greter then original num:\n",choice);
}
}}
