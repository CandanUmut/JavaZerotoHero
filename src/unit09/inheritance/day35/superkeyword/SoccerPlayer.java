package unit09.inheritance.day35.superkeyword;

import java.util.ArrayList;

public class SoccerPlayer extends Athlete{
    private int cleatSize;
    private ArrayList<String> kickStyles;

    public SoccerPlayer(String name, String team, int cleatSize, ArrayList<String> kickStyles) {
        super(name, team);
        this.cleatSize = cleatSize;
        this.kickStyles = kickStyles;
    }
    public void freekick(){
        System.out.println("Player using freekick.");
    }
    public void practice(){

        super.practice();
        for (String kickStyle :
                kickStyles) {
            System.out.println("Practicing the " + kickStyle);
        }

    }

    public int getCleatSize() {
        return cleatSize;
    }

    public void setCleatSize(int cleatSize) {
        this.cleatSize = cleatSize;
    }

    public ArrayList<String> getKickStyles() {
        return kickStyles;
    }

    public void setKickStyles(ArrayList<String> kickStyles) {
        this.kickStyles = kickStyles;
    }
}
