package unit09.inheritance.day34.AthleteInheritance;

import unit09.inheritance.day34.AthleteInheritance.Athlete;

public class SoccerPlayer extends Athlete {
    private int cleatSize;
    private String kickStyle;


    public SoccerPlayer(){
        cleatSize=10;
        kickStyle="Rovasata";
    }
    public void freekick(){
        System.out.println("The soccer player using the freekick");
    }

}
