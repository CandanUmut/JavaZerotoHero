package unit05.oop.day21;

public class PizzeriaMain {
    public static void main(String[] args) {
        Pizzeria fratelliPizza = new Pizzeria("Fratelli", 9.99,14.99,12.99,1.0);
        System.out.println(fratelliPizza);


        double PlainPizzas =3;
        int drinks = 7;

        double TotalPrice = fratelliPizza.plainTotal(PlainPizzas,drinks);
        System.out.println(TotalPrice);
    }
}
