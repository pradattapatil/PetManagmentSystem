package com.bridgelabz.petshop;

public class Cat extends Animal {

    public Cat(String id) {
        this.id = id;
        name = "cat";
        colour = String.valueOf(Colour.BLACK);
    }

    @Override
    public void eats(){
        System.out.println("Cat eats food");
    }
}
