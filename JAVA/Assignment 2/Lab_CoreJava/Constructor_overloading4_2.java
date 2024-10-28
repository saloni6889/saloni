//Create multiple constructors in a class and demonstrate constructor overloading.

package Lab_CoreJava;
class Studentt {
    String name;
    int age;
    Studentt(String name) {
        this.name = name;
        this.age = 18; 
    }
    Studentt(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name+ "Age: " + age);
    }
}
public class Constructor_overloading4_2 {
	public static void main(String[] args) {
        Studentt studentt1 = new Studentt("Saloni");        
        Studentt studentt2 = new Studentt("Neha", 22);   
        
        System.out.println("Student 1:");
        studentt1.display();
       
        System.out.println("Student 2:");
        studentt2.display();
    }

}
