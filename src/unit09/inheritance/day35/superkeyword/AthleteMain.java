package unit09.inheritance.day35.superkeyword;

import java.util.ArrayList;
import java.util.Arrays;

public class AthleteMain {
    public static void main(String[] args) {
        ArrayList<String> kicks=new ArrayList<>(Arrays.asList("Scorpion kick", "Bicycle Kick", "Toe Kick"));

        SoccerPlayer soccerPlayer= new SoccerPlayer("Hagi", "Galatasaray", 8, kicks);
        soccerPlayer.practice();

        Goalkeeper goalkeeper= new Goalkeeper("Buffon","Juventus",10,kicks,5);

        goalkeeper.practice();
    }
}
