package unit09.inheritance.day35.superkeyword;

public class Laptop extends Computer{
    private int batteryLife;

    public Laptop(String processor, int storage, int batteryLife) {
        super(processor, storage);
        this.batteryLife = batteryLife;
    }
    public void info(){
        super.info();

        System.out.println("The laptop has" + batteryLife + " left");


    }
}
