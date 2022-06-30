package Ls20;

import java.util.ArrayList;
import java.util.List;

public class Ls20 {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());
        test(listOfAnimals);
        test(listOfDogs);
        IOtherAnimal animal = new IOtherAnimal() {
            @Override
            public void eat() {
                System.out.println("qweqwe");
            }
        };
        animal.eat();
}

    private static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.eat();
        }
    }
}

