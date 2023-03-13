package unit13.DateTimeAPI.Date;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;

public class ParsingAndFormatting {
    public static void main(String[] args) {
        String stringDate= "2023-01-19";

        LocalDate parsedDAte= LocalDate.parse(stringDate);
        System.out.println(parsedDAte);
        System.out.println(parsedDAte.getDayOfWeek());
        System.out.println(parsedDAte.getYear());
        String stringTime ="17:35";
        LocalTime parsedTime = LocalTime.parse(stringTime);
        System.out.println(parsedTime.plusHours(1));

        String stringCustomDate = "12/1/23";

        try{
            LocalDate parsedCustomDate= LocalDate.parse(stringCustomDate);
            System.out.println(parsedCustomDate);
        }catch (DateTimeException exceptio){
            System.out.println("You cannot");
        }

    }
}
