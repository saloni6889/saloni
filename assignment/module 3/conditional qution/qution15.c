//15.Write a C program to determine eligibility for admission to a professional
//course based on the following criteria
//Eligibility Criteria : Marks in Maths >=65 and Marks in Phy >=55 and Marks
//in Chem>=50 and Total in all three subject >=190 or Total in Maths and
//Physics >=140 --------------------------------------Input the marks obtained in
//Physics :65 Input the marks obtained in Chemistry :51 Input the marks
//obtained in Mathematics :72 Total marks of Maths, Physics and Chemistry :
//188 Total marks of Maths and Physics : 137 The candidate is not eligible.
#include<stdio.h>
main()
{
	float maths,phy,chem,m_p_c,m_p;
	printf("enter the maths,physics chenistry mark out of 100:");
	scanf("%f",&maths);
	scanf("%f",&phy);
	scanf("%f",&chem);
	m_p_c=maths+phy+chem;
	m_p=maths+phy;
	if((maths>=65 && phy>=80 &&chem>=90)&&(m_p_c>190 || m_p>140))
	{
		printf("candidate is eligible");
	}
	else
	{
		printf("candidate in not eligible");
	}
}

