//Write a program to create and initialize an object using a parameterized constructor.

package Lab_CoreJava;

class D{
	int x,y;
	D(int a , int b){
	x=a;y=b;
	}
	void show() {
		System.out.println(x+" "+y);
	}
}
public class ParametCons7_1 {
	public static void main(String[] args) {
		D r=new D(100,200);
		r.show();
	}
}
