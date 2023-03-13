package unit09.inheritance.day37.methodwithPolymorphic.animal;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();

        Bird bird = new Bird();
        Dog dog = new Dog();
        Pig pig = new Pig();


        dog.animalSound();
        bird.animalSound();
        pig.animalSound();
        animal.animalSound();

        System.out.println(" " +
                "" +
                "" +
                "      ");
        System.out.println(" " +
                "  a "
        );

        ArrayList<Animal>farm = new ArrayList<>();
        farm.add(new Dog());
        farm.add(new Cat());
        farm.add(new Bird());


        for (Animal animal1:farm
             ) {
            animal1.animalSound();
            if(animal1 instanceof Cat){
                cat.sleep();
            }

        }
        Animal cat1 = new Cat();
        cat1.animalSound();
        cat.sleep();

    }




}
