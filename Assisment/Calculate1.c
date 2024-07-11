//**Create menu driven calculator using function
#include<stdio.h>


//function for add
add()
{
	int a,b;
	printf("enter the Num A:");
	scanf("%d",&a);//input a
	printf("enter the num B:");
	scanf("%d",&b);//input b
	printf("\nsum=%d",a+b);
}


//function for substraction
sub()
{
	int a,b;
	printf("enter the Num A:");
	scanf("%d",&a);
	printf("enter the num B:");
	scanf("%d",&b);
	printf("\nsum=%d",a-b);
}


//function for multiplication
mul()
{
	int a,b;
	printf("enter the Num A:");
	scanf("%d",&a);
	printf("enter the num B:");
	scanf("%d",&b);
	printf("\nsum=%d",a*b);
}

//funnction for division
div()
{
	int a,b;
	printf("enter the Num A:");
	scanf("%d",&a);
	printf("enter the num B:");
	scanf("%d",&b);
	printf("\nsum=%d",a/b);
}


main()
{
	int choice;//data member
	while(choice!=5)
	{
	printf("\n******Welcome our Calculater********:");
	   printf("\npree 1 for Addition:\n");
       printf("\npree 2 for Subtraction:\n");
	   printf("\npree 3 for Multiplication: \n");
	   printf("\npree 4 for Division:\n");
	   printf("\n 5 exit:\n");
	   printf("Enter the choice :");
	   scanf("%d",&choice);//enter the choice
	   
	   
	   //1-addition
    if(choice==1)
	{
		printf("\n******Addition\n*******");
	add();
		
	}	
	
	//2-substraction   
	else if(choice==2)
	{
		printf("\n*****Subtraction\n******");
		sub();
	}
	
	
	//3-multiplication
	else if(choice==3)
	{
		printf("\n******Multiplication*****\n");
		mul();
	}
	
	
	
	//4-division
	
	else if(choice==4)
	{
		printf("\n*******Division*******\n");
		div();
	}
	
	
	//exit
		else if(choice==5)
	{
		printf("\n*******exit*******\n");
		
	}
} }
