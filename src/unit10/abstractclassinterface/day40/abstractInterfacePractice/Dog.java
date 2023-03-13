package unit10.abstractclassinterface.day40.abstractInterfacePractice;

public class Dog extends Animal implements Swimmer{
    private  String breed;

    public Dog(String species, String breed) {
        super(species);
        this.breed = breed;
    }

    @Override
    public void animalSOund() {

    }

    @Override
    public void breathe() {
        super.breathe();
    }

    @Override
    public void Swim() {
        System.out.println("The dog swimming");

    }
}
