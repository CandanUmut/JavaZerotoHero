package unit10.abstractclassinterface.day40.abstractInterfacePractice;

public class Duck extends Bird implements Swimmer{
    public Duck(String species) {
        super(species);
    }

    @Override
    public void animalSOund() {
        System.out.println("Quajk quasdk");

    }

    @Override
    public void fly() {
        System.out.println("The duck is flying");

    }

    @Override
    public void Swim() {
        System.out.println("The duck is swimming");

    }
}
