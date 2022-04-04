package com.bridgelabz.petshop;

public class Rabbit extends Animal {

    public Rabbit(String id) {
        this.id = id;
        name = "rabbit";
        colour = String.valueOf(Colour.RED);
    }

    @Override
    public void eats() {
        System.out.println("Rabbit eats carrots");
    }
}
