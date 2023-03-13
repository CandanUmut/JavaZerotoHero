package unit05.oop.day24;

public class Homework {
    private String name;
    private int maxPoint;
    private static int numOfHWs = 0;

    public Homework(String name, int maxPoint){
        this.name= name;
        this.maxPoint= maxPoint;
        numOfHWs++;

    }
    public static int getNumOfHWs(){
        return numOfHWs;
    }

    public static void printInfo(){
        System.out.println();
    }
    public void printName(){

    }
}
