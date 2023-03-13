package unit02.objects.day10;

public class EqualMethod {
    public static void main(String[] args) {
        String state = "New York";

        String otherState = "California";
        System.out.println(state.equals(otherState));
        String newState = "New York";
        System.out.println(state.equals(newState));

        String name1 = "Umut";
        String name2 = "Ahmet";
        System.out.println(name1.equals(name2));
        //charAt method
        System.out.println(name1.charAt(name2.length()-2));
// isEmpty method
        String emptyString = "";
        System.out.println(emptyString.isEmpty());

        //replace Method
        System.out.println("SDET is the best." .replace("best", "awesome"));



        System.out.println(newState.toUpperCase());


    }
}
