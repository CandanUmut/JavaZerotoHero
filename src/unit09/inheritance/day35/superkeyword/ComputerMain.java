package unit09.inheritance.day35.superkeyword;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer =new Computer("Intel", 1024);
        Laptop laptop = new Laptop("AMD", 2056,100);
        computer.info();

        laptop.info();
    }
}
