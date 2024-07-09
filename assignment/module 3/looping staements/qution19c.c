#include <stdio.h> 
main() 
{ 
    int j,k, i,rows=5; 
  
    // first loop to print all rows 
    for(i=0;i<rows;i++)
	 { 
        // inner loop 1 to print white spaces 
        for(j=0;j<2*(rows-i)-1;j++)
		 { 
            printf(" "); 
         } 
  
        // inner loop 2 to print star * character 
        for(k =0;k<2*i+1;k++)
		 { 
            printf("* "); 
         } 
        printf("\n"); 
    } 
}
