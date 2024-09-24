//17). Calculate person’s insurance premium based on salary 

#include<stdio.h>
main(){
	int salary,year;//data member
	printf("Enter your monthly salary:");
	scanf("%d",&salary);//input salary
	printf("How many year to continue the insurance premium: ");
	scanf("%d",&year);//input year
	
	
	//if salary less than 5000 than 5% dedacted from salary
	if(salary<5000){
		int ip;
		ip=(salary*5)/100;
		printf("Your salary is :%d\n",salary);
		printf("Your total insurance premium is :%d\n",ip*year*12);//total insurance premium 
		
		
	}
	
	//if salary betweeen  5000  to 100000 than 8 % dedacted from salary
	else if(salary>=5000 && salary<10000){
		int ip;
		ip=(salary*8)/100;
		printf("Your salary is :%d\n",salary);
		printf("Your total insurance premium is :%d\n",ip*year*12);
		
		
	}
	else if(salary>=10000 && salary<25000){
		int ip;
		ip=(salary*10)/100;
		printf("Your salary is :%d\n",salary);
		printf("Your total insurance premium is :%d\n",ip*year*12);
		
		
	}else {
		int ip;
		ip=(salary*15)/100;
		printf("Your salary is :%d\n",salary);
		printf("Your total insurance premium is :%d\n",ip*year*12);
		
		
	}
	
	
}
