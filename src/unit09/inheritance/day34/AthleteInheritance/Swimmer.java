package unit09.inheritance.day34.AthleteInheritance;

import unit09.inheritance.day34.AthleteInheritance.Athlete;

public class Swimmer extends Athlete {
    private String swimStyle;


    public Swimmer(){
        swimStyle = "Frog";

    }
    public void dive(){
        System.out.println("Swimmer can dive");
    }
}
