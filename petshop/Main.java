package com.bridgelabz.petshop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Pet management system!!");

        Dog dog = new Dog("d001");
        dog.age = 20;
        dog.price = 100;
        dog.breed = "abc";

        Cat cat = new Cat("c001");
        cat.age = 15;
        cat.price = 150;
        cat.breed = "def";

        Parrot parrot = new Parrot("p001");
        parrot.age = 12;
        parrot.price = 200;
        parrot.species = "efg";

        Parrot parrot1 = new Parrot("p001");
        parrot.age = 12;
        parrot.price = 500;
        parrot.species = "hefg";

        Duck duck = new Duck("d001");
        duck.age = 22;
        duck.price = 300;
        duck.species = "xyz";

        Rabbit rabbit = new Rabbit("r001");
        rabbit.age = 25;
        rabbit.price = 220;
        rabbit.breed = "mno";

        PetStorage petStorage = new PetStorage();
        petStorage.add(dog);
        petStorage.add(cat);
        petStorage.add(rabbit);
        petStorage.add(parrot);
        petStorage.add(duck);

        UserInterface userInterface = new UserInterface();
        //userInterface.print(petStorage.getPetList());
        Set petList = petStorage.getPetList();
        userInterface.print(petList);

        petStorage.remove(cat);
        System.out.println("After removing");
        userInterface.print(petList);

        System.out.println("Print Animals");
        userInterface.printAnimals(petList);

        System.out.println("Print Animals");
        userInterface.printBirds(petList);

    }
}
