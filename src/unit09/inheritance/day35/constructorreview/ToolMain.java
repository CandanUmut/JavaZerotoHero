package unit09.inheritance.day35.constructorreview;

public class ToolMain {
    public static void main(String[] args) {
        BatteryPowerTool drill=new BatteryPowerTool("Drill","Dewalt","5 Amp Adapter",200);
        System.out.println("Tool :"+drill.getName()+" Brand : "+drill.getBrand()+" Adapter :"+drill.getPowerAdapter()+" Watt :"+drill.getBatteryWatt());
    }
}

