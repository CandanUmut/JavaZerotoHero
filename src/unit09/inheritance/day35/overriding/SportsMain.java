package unit09.inheritance.day35.overriding;

import java.util.ArrayList;
import java.util.Arrays;

public class SportsMain {
    public static void main(String[] args) {
        Athlete athlete=new Athlete("John Doe","Team USA");
        athlete.practice();
        ArrayList<String> kicks=new ArrayList<>(Arrays.asList("Scorpion kick", "Bicycle Kick", "Toe Kick"));
        SoccerPlayer soccerPlayer= new SoccerPlayer("Hagi","Galatasaray",8,kicks);
        soccerPlayer.practice();
        soccerPlayer.freekick();
        Hockey hockey=new Hockey("John Cena","Team Anadolu",8);
        hockey.practice();

    }
}
