package unit09.inheritance.day34.AthleteInheritance;

import unit09.inheritance.day34.AthleteInheritance.Athlete;

public class HockeyPlayer extends Athlete {
    private int skateSize;


    public HockeyPlayer(){
        skateSize =8;
    }
    public void shoot(){
        System.out.println("Hockey player is shooting. ");
    }
    public void pass(){
        System.out.println("Hockey player is passing");
    }
}
