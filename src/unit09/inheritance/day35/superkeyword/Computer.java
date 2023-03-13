package unit09.inheritance.day35.superkeyword;

public class Computer {
    private String processor;
    private int storage;

    public Computer(String processor, int storage) {
        this.processor = processor;
        this.storage = storage;
    }

    public void info(){
        System.out.println("The computer has "+ processor+"processor and" + storage +" gb of storage");

    }
}
