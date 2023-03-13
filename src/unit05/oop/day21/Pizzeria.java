package unit05.oop.day21;

public class Pizzeria {
    private String storeName;
    private double plainPrice;
    private double pepperoniPrice;
    private double veggiePrice;
    private double drinkPrice;


    /*
    Method to calculate plain pizza and drink order
    It will get two parameters
    first parameter for the number of plain pies
    second parameter for the number of drinks
    it will return the total price

     */


    /*Declaration of the method,
    method signature
     */

    public double plainTotal(double numOfPies, int numOfDrinks){
        double total= 0.0;
        total = (numOfPies*plainPrice)+numOfDrinks*drinkPrice;


        return total;
    }




    public Pizzeria(String storeName, double plainPrice, double pepperoniPrice, double veggiePrice, double drinkPrice) {
        this.storeName = storeName;
        this.plainPrice = plainPrice;
        this.pepperoniPrice = pepperoniPrice;
        this.veggiePrice = veggiePrice;
        this.drinkPrice = drinkPrice;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public double getPlainPrice() {
        return plainPrice;
    }

    public void setPlainPrice(double plainPrice) {
        this.plainPrice = plainPrice;
    }

    public double getPepperoniPrice() {
        return pepperoniPrice;
    }

    public void setPepperoniPrice(double pepperoniPrice) {
        this.pepperoniPrice = pepperoniPrice;
    }

    public double getVeggiePrice() {
        return veggiePrice;
    }

    public void setVeggiePrice(double veggiePrice) {
        this.veggiePrice = veggiePrice;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    @Override
    public String toString() {
        return "Pizzeria{" +
                "storeName='" + storeName + '\'' +
                ", plainPrice=" + plainPrice +
                ", pepperoniPrice=" + pepperoniPrice +
                ", veggiePrice=" + veggiePrice +
                ", drinkPrice=" + drinkPrice +
                '}';
    }

}
