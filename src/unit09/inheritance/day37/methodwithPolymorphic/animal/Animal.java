package unit09.inheritance.day37.methodwithPolymorphic.animal;

public class Animal {

    public void animalSound(){
        System.out.print(this.getClass().getSimpleName());
    }
}
class Cat extends Animal{
    @Override
    public void animalSound() {
        super.animalSound();

        System.out.println(" Meow Meow");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}

class Dog extends Animal{
    @Override
    public void animalSound() {
        super.animalSound();
        System.out.println(" Hav Hav");
    }
}

class Pig extends Animal{
    @Override
    public void animalSound() {
        super.animalSound();
        System.out.println("Oink Oink");
    }
}

class Bird extends Animal{
    @Override
    public void animalSound() {
        super.animalSound();
        System.out.println("CikCik");
    }

}


