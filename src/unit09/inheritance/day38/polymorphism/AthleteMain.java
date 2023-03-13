package unit09.inheritance.day38.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AthleteMain {
    public static void main(String[] args) {
        Athlete athlete1 = new HockeyPlayer("Umut");
        Athlete athlete2 = new Swimmer("Michael Phelps");

        athlete1.practice();
        athlete2.practice();

        if (athlete1 instanceof Swimmer) {
            ((Swimmer) athlete1).swimming();

        }
        if (athlete2 instanceof Swimmer) {
            ((Swimmer) athlete2).swimming();
        }

        ArrayList<Athlete> athletes =
                new ArrayList<>(List.of(athlete1, athlete2));

        if (athlete1 instanceof Swimmer) {
            ((Swimmer) athlete1).swimming();
        }
        for (Athlete athlete : athletes
        ) {
            athlete.practice();
            if (athlete instanceof HockeyPlayer) {
                System.out.println("Shoot for us");
                ((HockeyPlayer) athlete).shoot();
            }


        }
    }






}
