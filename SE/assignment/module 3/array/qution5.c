//5.WAP to take two Array input from user and sort them in ascending or
//descending order as per user’s choice.
#include<stdio.h>
desending(int a[],int n)
{
int i,j,temp;
for(i=0;i<n;i++)
	{
		for(j=n-1;j>i;j--)
		{
			if(a[j]>a[i])
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}
		printf("\nDesending order:");
		for(i=0;i<n;i++)
		{
			printf("%d\n",a[i]);
		}
	
}


aecending(int a[],int n)
{
	int i,j,temp;
for(i=0;i<n;i++)
	{
		for(j=n-1;j>i;j--)
		{
			if(a[j]<a[i])
			{
			
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}
		printf("\aecending order:");
		for(i=0;i<n;i++)
		{
			printf("%d\n",a[i]);
		}
	
}

main()
{
	int n,i;
	printf("enter array size:");
	scanf("%d",&n);
	int a[n];
	printf("element:");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("____________array 2____________\n");
	int b[n];
	printf("element:");
		for(i=0;i<n;i++)
	{
		scanf("%d",&b[i]);
	}
	
	int choice;
	printf("\nEnter the choice 1-ace 2-dec:");
	scanf("%d",&choice);
	switch(choice){
		case 1:
			aecending(a,n);
			aecending(b,n);
			break;
		case 2:
			desending(a,n);
			desending(b,n);	
			break;
		default:
		printf("enter the value:");	
		break;
			
	}
}


