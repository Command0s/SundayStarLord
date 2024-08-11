package com.upskill.assignment_3;

//Base class
class Animal {
 // Method to make a sound
 void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

//Derived class
class Dog extends Animal {
 // Overriding the makeSound method
 @Override
 void makeSound() {
     System.out.println("Dog barks");
 }
}

//Another derived class
class Cat extends Animal {
 // Overriding the makeSound method
 @Override
 void makeSound() {
     System.out.println("Cat meows");
 }
}

public class Assignment_3_4 {
 public static void main(String[] args) {
     // Reference variable of type Animal
     Animal myAnimal;

     // Object of type Dog
     myAnimal = new Dog();
     // Method call resolved at runtime
     myAnimal.makeSound(); // Outputs: Dog barks

     // Object of type Cat
     myAnimal = new Cat();
     // Method call resolved at runtime
     myAnimal.makeSound(); // Outputs: Cat meows
 }
}

