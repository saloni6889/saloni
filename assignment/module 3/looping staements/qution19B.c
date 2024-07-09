//19-b)
#include<stdio.h>
main(){
	int i,j,num;
	printf("enter the number:");
	scanf("%d",&num);//colume 
	i=1;
	char ch=65;
	while(i<=num){
		j=1;
		while(j<=i){
			printf("%c",ch);//print alphabate3
			
			ch++;
			j++;
			
			
		}
		printf("\n");
		i++;
	}
}
