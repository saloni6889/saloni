//Implement method overriding to show polymorphism in action.

package Lab_CoreJava;

class Shape {
 void draw() {
     System.out.println("Drawing a shape");
 }
}
class Circle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a circle");
 }
}
class Rectangle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a rectangle");
 }
}

public class Polimor_overrid6_3 {
 public static void main(String[] args) {
    
     Shape myShape1 = new Circle();    
     Shape myShape2 = new Rectangle(); 

     // Dynamic method dispatch (polymorphism)
     myShape1.draw(); 
     myShape2.draw(); 
 }
}