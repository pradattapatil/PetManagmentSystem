package com.bridgelabz.petshop;

public class Dog extends Animal implements Swimmable {

    public Dog(String id) {
        this.id = id;
        name = "dog";
        colour = String.valueOf(Colour.GRAY);
    }

    @Override
    public void eats(){
        System.out.println("Dog eats flesh");
    }

    public void swim(){
        System.out.println("Dog can swim");
    }
}
