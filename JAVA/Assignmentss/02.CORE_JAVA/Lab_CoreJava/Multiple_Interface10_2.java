//Write a program that implements multiple interfaces in a single class.

package Lab_CoreJava;

interface CanFly {
 void fly();
}

interface CanSwim {
 void swim();
}

interface CanQuack {
 void quack();
}

class Duck implements CanFly, CanSwim, CanQuack {
 @Override
 public void fly() {
     System.out.println("Duck is flying.");
 }

 @Override
 public void swim() {
     System.out.println("Duck is swimming.");
 }

 @Override
 public void quack() {
     System.out.println("Duck is quacking.");
 }
}

public class Multiple_Interface10_2 {
 public static void main(String[] args) {
     Duck myDuck = new Duck(); 
     myDuck.fly();   
     myDuck.swim();  
     myDuck.quack(); 
 }
}
