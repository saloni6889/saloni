//Write a program demonstrating single inheritance

package Lab_CoreJava;

class student{
	int roll , marks;
	String name;
	void input() {
		System.out.println("Enter roll name & marks:");
	}
}
class saloni extends student{
	void disp() {
		roll=2; name="saloni"; marks=80;
		System.out.println(roll+" "+name+" "+marks);
	}
}
public class Single_Inheritance6_1 {
public static void main(String[] args) {
	saloni r=new saloni();
	r.input();
	r.disp();
   }
}
