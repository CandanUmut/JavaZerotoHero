package unit09.inheritance.day38.polymorphism;

public class Swimmer extends Athlete{
    public Swimmer(String name) {
        super(name);
    }

    @Override
    public void practice() {
        super.practice();
        swimming();
    }

    public void swimming(){
        System.out.println("The swimmer is swimming.");
    }
}
