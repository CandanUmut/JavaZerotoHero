package unit01.primitive.types.day03;

public class TemperatureConverter {
    public static void main(String[] args) {
//         C = (F-32) *5/9;
        double tempF = 30.0;

        double convertedValue;
        convertedValue = (tempF - 32) * 5/9;
        System.out.print("The converted Celcius degree is : ");
        System.out.println(convertedValue);


    }
}
