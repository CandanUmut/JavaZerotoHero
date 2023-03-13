package unit09.inheritance.day35.overriding;

public class SportsCar extends CAr {
    private int maxSpeed;

    public SportsCar(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String drive() {

        return "Driving at high speed";

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
