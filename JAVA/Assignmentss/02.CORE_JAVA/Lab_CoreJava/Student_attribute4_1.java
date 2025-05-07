//Create a class Student with attributes (name, age) and a method to display thedetails.

package Lab_CoreJava;
class Student {
    String name;
    int age;
    void display() {
        System.out.println("Name: " + name+ "Age: " + age);
    }
}
public class Student_attribute4_1 {
	public static void main(String[] args) {
		Student student = new Student();
		 student.name="Saloni";
		 student.age=20;
		 
		 student.display();
	}
}
