//37. WAP to show
//i. Monday to Sunday using switch case
//ii. Vowel or Consonant using switch case
#include<stdio.h>
main()
{
	int num;
	printf("enter the num from 1 to 7:");
	scanf("%d",&num);
	swithc (num)
	{
		case 1:
			printf("monday");
			break;
		case 2:
			printf("tuesday");
			break;
		case 3:
			printf("wednesday");
			break;
		case 4:
			printf("thursday");
			break;
		case 5:
			printf("friday");
			break;
		case 6:
			printf("saturday");
			break;
		case 7:
			printf("sunday");
			break;
	}
}
