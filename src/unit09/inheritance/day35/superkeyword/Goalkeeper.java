package unit09.inheritance.day35.superkeyword;

import java.util.ArrayList;

public class Goalkeeper extends SoccerPlayer{
    private int gloveSize;

    public Goalkeeper(String name, String team, int cleatSize, ArrayList<String> kickStyles, int gloveSize) {
        super(name, team, cleatSize, kickStyles);
        this.gloveSize = gloveSize;
    }

    public void goalKick(){
        System.out.println("Goalkeeper is taking the goal kick");
    }

    public void practice(){
        System.out.println("The plater is praxticing the saving styles");
        super.practice();
    }
}
