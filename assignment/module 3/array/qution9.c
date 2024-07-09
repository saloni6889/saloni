//9)WAP to show difference between Structure and Union. 


//diffrencess betweenn u and s


/*1-declaration
struct-dclare using struct keyword
union -declare using union keyword

2-sizeof union and struct
struct- size of struct  is sum of size of each data member;
union-size of struct  is equal to  size of  largest  data member;

3-initilization and accessing 

struct-all data member is initilization at a time;
union-all data member is not initilization at a time;
struct-all data member is accesing  at a time;
union-all data member is not accessing at a time;
*/



#include<stdio.h>
//struct
struct info{
	int id;
	char favChar;
};


//union
union info1{
	int id;
	char favChar;
};
main(){
struct info s={3,'c'};//initilization at a time
printf("%d %c\n",s.id,s.favChar);//accessing at a time
printf("Size of struct: %d\n",sizeof(s));//size of struct is 8



printf("\n_________Data lose ________\n ");
//data lose
union info1 u={4,'p'};//not initilization at a time
printf("%d %c\n",u.id,u.favChar);// not accessing at a time
printf("Size of union:%d\n",sizeof(u));//size of struct is 4

printf("\n________print the proper output ________\n ");

//error solve
printf("\nData lose beacuse initilizatoon and accesing at a time:\n ");
union info1 u1,u2;//not initilization at a time
u1.id=2;
u2.favChar='s';
printf("%d\t",u1.id);
printf("%c\n",u2.favChar);// not accessing at a time
printf("Size of union:%d\n",sizeof(u));

	
}
