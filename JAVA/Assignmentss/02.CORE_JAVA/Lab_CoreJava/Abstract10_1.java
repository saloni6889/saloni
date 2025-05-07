//Create an abstract class and implement its methods in a subclass.

package Lab_CoreJava;

abstract class Parentt {
	 abstract void show();
	}
	class FirstSubclass extends Parentt {
	 @Override
	 void show() {
	     System.out.println("This is first subclass");
	  }
	}
	class SecondSubclass extends Parentt {
	 @Override
	 void show() {
	     System.out.println("This is second subclass");
	  }
	}
	public class Abstract10_1 {
	 public static void main(String[] args) {
	     Parentt obj1 = new FirstSubclass();
	     obj1.show();
	     Parentt obj2 = new SecondSubclass();
	     obj2.show();
	  }
	}
