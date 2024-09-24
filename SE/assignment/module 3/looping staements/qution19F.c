//qution19 F
#include<stdio.h>
main(){
	int i,j,top,left,size,n;
	size=10;//2d array size
	left=0;//starting index
	top=size-1;//last index
	n=1;
	int number[size][size];//2d array
	
	
	for(i=1;i<=size/2;i++,top--,left++){
		for(j=left;j<=top;j++,n++){
		number[left][j]=n;	
		}
		for(j=left+1;j<=top;j++,n++){
		number[j][top]=n;	
		}
		for(j=top-1;j>=left;j--,n++){
		number[top][j]=n;	
		}
		for(j=top-1;j>=left+1;j--,n++){
		number[j][left]=n;	
		}
	}
	for(i=0;i<size;i++){
		for(j=0;j<size;j++){
			printf("%d\t",number[i][j]);
		}
		printf("\n");
	}
}
