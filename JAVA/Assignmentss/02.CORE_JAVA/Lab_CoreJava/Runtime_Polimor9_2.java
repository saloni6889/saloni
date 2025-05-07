//Implement runtime polymorphism by overriding methods in the child class

package Lab_CoreJava;

class Anim {
 void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

class Dog extends Animal {
 @Override
 void makeSound() {
     System.out.println("Dog barks");
 }
}

public class Runtime_Polimor9_2 {
 public static void main(String[] args) {
     Animal myAnimal = new Animal(); 
     Animal myDog = new Dog();       

     myAnimal.makeSound(); 
     myDog.makeSound();  
   }
}

    
