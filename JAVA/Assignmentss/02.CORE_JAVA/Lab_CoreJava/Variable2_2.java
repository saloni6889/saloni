//Variable Declaration and Initialization

package Lab_CoreJava;
class G{
	static int b=20;
	int c=30;
}
public class Variable2_2 {
	public static void main(String[] args) {
		int a=10;
		G ref=new G();
		System.out.println(a);
		System.out.println(G.b);
		System.out.println(ref.c);
	}
}
