package com.bridgelabz.petshop;

import java.util.Objects;

public abstract class Pet {
    enum Colour{BLACK, RED, WHITE, BLUE, BLACK_WHITE, GREEN, GRAY}

    String id;
    String colour;
    String name;
    int age;
    int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return id.equals(pet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public abstract void eats();

    @Override
    public String toString() {
        return "Pet{" +
                "id='" + id + '\'' +
                ", colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';

    }
}
