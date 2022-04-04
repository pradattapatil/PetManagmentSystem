package com.bridgelabz.petshop;

public abstract class Animal extends Pet {
    String breed;

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                ", colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                ", breed='" + breed + '\'' +
                '}';
    }
}
