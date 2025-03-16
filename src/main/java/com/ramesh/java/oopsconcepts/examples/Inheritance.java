package com.ramesh.java.oopsconcepts.examples;

class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    void makeSound() {
        System.out.println(name + " makes a sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(name + " barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        animal.makeSound();
        Dog dog = new Dog("Shampoo");
        dog.makeSound();
    }
}
