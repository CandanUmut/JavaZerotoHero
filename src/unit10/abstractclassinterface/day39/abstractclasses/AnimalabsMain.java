package unit10.abstractclassinterface.day39.abstractclasses;

import java.util.ArrayList;

public class AnimalabsMain {
    public static void main(String[] args) {
        ArrayList<Animalabst> farm = new ArrayList<>();
        farm.add(new Cat1());
        farm.add(new Dog());
        farm.add(new Cow());
        farm.add(new Pig());
        farm.add(new Dog());
        farm.add(new Cat1());
        farm.add(new Cow());

        for (Animalabst animal:farm
             ) {
            animal.makeSound();

        }
    }
}
