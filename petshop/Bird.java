package com.bridgelabz.petshop;

public abstract class Bird extends Pet{
    String species;

    @Override
    public String toString() {
        return "Bird{" +
                "id='" + id + '\'' +
                ", colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                ", species='" + species + '\'' +
                '}';
    }
}
