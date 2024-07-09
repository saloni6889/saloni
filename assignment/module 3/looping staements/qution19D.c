//19-d)
#include<stdio.h>
main(){

int i,j,num;
	printf("enter the number:");
	scanf("%d",&num);//colume 
	i=1;
	
	
	//for the half triangle
	while(i<=num){
		j=1;
		while(j<=i){
			printf("*");
			j++;
		
			
		}
		printf("\n");
		i++;
	}
	
	//for the second triangle
		i=2;
		while(i<=num){
		j=num+1;
		while(j>i){
			printf("*");
			j--;
		
			
		}
		printf("\n");
		i++;
}
		
}
