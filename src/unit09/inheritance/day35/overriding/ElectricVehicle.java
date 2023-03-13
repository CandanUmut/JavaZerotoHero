package unit09.inheritance.day35.overriding;

public class ElectricVehicle extends CAr{
    private int batteryLEvel;

    public ElectricVehicle() {
        batteryLEvel=100;
    }

    public String fill(){
        batteryLEvel=100;
        return "Battery is charging";
    }

    public int getBatteryLEvel() {
        return batteryLEvel;
    }

    public void setBatteryLEvel(int batteryLEvel) {
        this.batteryLEvel = batteryLEvel;
    }
}
