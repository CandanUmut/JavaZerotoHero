package unit03.conditionals.day12;

public class Store {
    private int price;

    public Store() {
        this.price = 25;
    }

    public int getTotalPrice(int quantity){
        if(quantity>= 5){
            price--;

        }
        return quantity*price;
    }
}
