package com.bridgelabz.petshop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UserInterface {
    public void print(Set petList) {
//        for(int i = 0; i < petList.size(); i++){
//            System.out.println(petList.get(i));
//        }

        for (Object o : petList) {
            System.out.println(o);
        }
    }

    public void printAnimals(Set<Pet> petList) {
        for (Pet o: petList) {
            if (o instanceof Animal) {
                System.out.println(o);
            }
        }
    }

    public void printBirds(Set<Pet> petList) {
        for (Pet o: petList) {
            if (o instanceof Bird) {
                System.out.println(o);
            }
        }
    }

    public void printSwimmables(Set<Pet> petList){
        for (Pet pet: petList) {
            if (pet instanceof Swimmable) {
                Swimmable swimmablePet = (Swimmable)pet;
                swimmablePet.swim();
            }
        }
    }

    public void printFlayablbes(Set<Pet> petList){
        for (Pet pet: petList) {
            if (pet instanceof Flyable) {
                Flyable flyablePet = (Flyable) pet;
                flyablePet.fly();
            }
        }
    }
}
