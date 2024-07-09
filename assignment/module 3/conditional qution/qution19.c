/*19)Write a program in C to calculate and print the electricity bill of a given
customer. The customer ID, name, and unit consumed by the user should
be captured from the keyboard to display the total amount to be paid to the
customer. The charge are as follow :*/
#include<stdio.h>
#include<string.h>

main(){
	char n[30];
	int id,unit,total_amount;
	

	printf("Name of customer:");

    gets(n);//name of cutomer
	
	printf("Enter the id :");
     scanf("%d",&id);//input id

	printf("Enter the unit :");
	scanf("%d",&unit);//input unit 
	
	//if unit less than 
	if(unit<350){
	total_amount=unit*1.20;
	printf("Total_amount of %s:%d",n,total_amount)	;
	}
	
	//if between 350 to 600 
	else if(unit>=350 && unit<600){
	total_amount=unit*1.50;
	printf("Total_amount of %s:%d",n,total_amount)	;
	}
	else if(unit>=600 && unit<800){
	total_amount=unit*1.80;
	printf("Total_amount of %s:%d",n,total_amount)	;
	}
	else{
	total_amount=unit*2.00;
	printf("Total_amount of %s:%d",n,total_amount)	;

	}
}
