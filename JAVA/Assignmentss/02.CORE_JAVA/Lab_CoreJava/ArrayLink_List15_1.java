package Lab_CoreJava;

import java.util.ArrayList;
//Write a program that demonstrates the use of an ArrayList and LinkedList

import java.util.LinkedList;

public class ArrayLink_List15_1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Rabbit");

        // Print ArrayList
        System.out.println("ArrayList: " + arrayList);

        // Print LinkedList
        System.out.println("LinkedList: " + linkedList);
    }
}
