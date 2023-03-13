package unit13.DateTimeAPI.Date;

import java.time.LocalDate;
import java.time.Month;

public class Date {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.getDayOfWeek());

        LocalDate birhdayUmut= LocalDate.of(1995, Month.NOVEMBER, 30);
        System.out.println("Umut Candan Was born in " + birhdayUmut);
        System.out.println("Umut Candan was born in the " + birhdayUmut.getYear());
        System.out.println("Umut Candan was born in the " + birhdayUmut.getDayOfWeek());
        System.out.println("Umut Candan was born in the " + birhdayUmut.getMonth());
    }
}
