package unit02.objects.day07;

public class HumanMain {
    public static void main(String[] args) {
        Human human1 = new Human("Umut");

        System.out.println(human1);
        Human human2 = new Human();
        human1.printName();
        human2.printName();

        Human human3;
        System.out.println(human2);


    }
}
