package Ls19;

import java.util.ArrayList;
import java.util.List;

public class Ls19 {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        List<Dog> listOfDogs = new ArrayList<>();
        listOfAnimals.add(new Animal());
        listOfAnimals.add(new Animal());
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());
        test(listOfAnimals);
        test(listOfDogs);
    }

    private static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.eat();
        }
    }
}

