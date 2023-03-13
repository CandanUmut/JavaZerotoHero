package unit10.abstractclassinterface.day40.abstractInterfacePractice;

public abstract class Animal {
    private String species;

    public void breathe(){
        System.out.println("Breathe in, Breathe out");
    }

    public abstract void animalSOund();

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }
}
