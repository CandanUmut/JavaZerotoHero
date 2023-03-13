package unit10.abstractclassinterface.day40.abstractInterfacePractice;

import unit09.inheritance.day34.inheritancePractice.Plane;
import unit10.abstractclassinterface.day40.example.A;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Duck ducky = new Duck("Donald");
        Dog karabas= new Dog("Pekin", "Husky");
        Plane plane = new Plane();

        ducky.fly();
        ducky.Swim();
        ducky.animalSOund();
        karabas.breathe();

        ArrayList<Flyable>flyables= new ArrayList<>();
        flyables.add(ducky);


        for(Flyable flyable: flyables){
            flyable.fly();
        }

        ArrayList<Swimmer>swimmers= new ArrayList<>();
        swimmers.add(ducky);
        swimmers.add(karabas);

        for (Swimmer swimmera:swimmers
             ) {
            swimmera.Swim();

        }

    }
}
