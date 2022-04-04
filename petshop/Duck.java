package com.bridgelabz.petshop;

public class Duck extends Bird implements Swimmable, Flyable {

    public Duck(String id) {
        this.id = id;
        name = "duck";
        colour = String.valueOf(Colour.WHITE);
    }

    @Override
    public void eats(){
        System.out.println("Duck eats fish");
    }


    public void swim(){
        System.out.println("Duck can swim");
    }

    public void fly(){
        System.out.println("Duck can fly");
    }
}
