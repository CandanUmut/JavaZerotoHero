package unit09.inheritance.day38.polymorphism;

public class HockeyPlayer extends Athlete {
    private String name1;

    public HockeyPlayer(String name) {
        super(name);
        this.name1 = name1;
    }

    @Override
    public void practice() {
        super.practice();
        shoot();
        pass();
    }
    public void shoot(){
        System.out.println("The player is shooting");
    }

    public void pass(){
        System.out.println("The player is passing the puck");
    }
}
