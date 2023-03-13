package unit01.primitive.types.day04;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Fahrenheit to Celcius Converter Please enter the Temperature as a Fahrenheit : ");

        double temperature ;
        temperature = input.nextDouble();
        System.out.print("It's ");
        System.out.print((temperature- 32) * 5/9);
        System.out.print(" Celcius degree");


    }
}
