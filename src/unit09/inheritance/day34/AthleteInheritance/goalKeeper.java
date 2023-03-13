package unit09.inheritance.day34.AthleteInheritance;

public class goalKeeper extends SoccerPlayer {
    private int gloveSize;


    public goalKeeper(){
        gloveSize=7;
    }
    public void goalKick(){
        System.out.println("Goalkeepere can save goalkicks");
    }
}
