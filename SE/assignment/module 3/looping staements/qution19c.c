#include <stdio.h> 
main() 
{ 
    int j,k, i,rows=5; 
    for(i=0;i<rows;i++)
	 { 
        for(j=0;j<2*(rows-i)-1;j++)
		 { 
            printf(" "); 
         }  
        for(k =0;k<2*i+1;k++)
		 { 
            printf("* "); 
         } 
        printf("\n"); 
    } 
}
