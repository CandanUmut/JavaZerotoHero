package unit02.objects.day08;

public class FlashLight {
    // instance variable
    private boolean isOn;
    //constructor

    public FlashLight() {
        this.isOn = false;
    }
    public void turnOff(){
        isOn = false;
        System.out.println("Flashlight is off");

    }
    public void turnOn(){
        isOn=true;
        System.out.println("Flashlight is on");

    }
}
