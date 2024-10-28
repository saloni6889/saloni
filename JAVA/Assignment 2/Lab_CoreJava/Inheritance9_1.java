//Write a program that demonstrates inheritance using extends keyword. 

package Lab_CoreJava;

class Animal {
 void eat() {
     System.out.println("This animal eats food.");
 }
}

class Dog extends Animal {
 void bark() {
     System.out.println("Dog barks.");
 }
}

class Cat extends Animal {
 void meow() {
     System.out.println("Cat meows.");
 }
}

public class Inheritance9_1 {
 public static void main(String[] args) {
     
     Dog dog = new Dog();
     dog.eat();  
     dog.bark(); 

     
     Cat cat = new Cat();
     cat.eat();  
     cat.meow(); 
 }
}
