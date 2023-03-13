package unit09.inheritance.day35.overriding;

public class Hockey extends Athlete {
    private int skateSize;

    public Hockey(String name, String team, int skateSize) {
        super(name, team);
        this.skateSize = skateSize;
    }

    public int getSkateSize() {
        return skateSize;
    }

    public void setSkateSize(int skateSize) {
        this.skateSize = skateSize;
    }
    public void pass(){
        System.out.println("Hockey player is practicing shooting.");
    } public void shoot(){
        System.out.println("Hockey is practicing shooting.");
    }
    public void practice(){
        pass();
        shoot();
    }
}


