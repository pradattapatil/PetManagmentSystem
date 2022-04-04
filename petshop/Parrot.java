package com.bridgelabz.petshop;

public class Parrot extends Bird {

    public Parrot(String id) {
        this.id = id;
        name = "parrot";
        colour = String.valueOf(Colour.GREEN);
    }

    @Override
    public void eats(){
        System.out.println("Parrot eats fruits");
    }
}
