//Create a class hierarchy and demonstrate multilevel inheritance

package Lab_CoreJava;

class Animal {
 void eat() {
     System.out.println("Animal eats");
 }
}

class Mammal extends Animal {
 void walk() {
     System.out.println("Mammal walks");
 }
}

class Dog extends Mammal {
 void bark() {
     System.out.println("Dog barks");
 }
}

public class Hirachy_Multilevel6_2 {
 public static void main(String[] args) {
  
     Dog myDog = new Dog();
     myDog.eat();   
     myDog.walk();  
     myDog.bark();  
 }
}
