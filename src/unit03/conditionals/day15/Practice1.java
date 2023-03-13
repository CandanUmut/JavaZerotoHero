package unit03.conditionals.day15;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(getTotal(10));


    }


        public static int getTotal(int quantity){
            int itemPrice = 20;
            int shipment = 7;
            int total = 0;

            if (quantity > 0) {
                if (quantity > 10 && quantity < 15) {
                    itemPrice -= 2;
                    total =((quantity * itemPrice) + shipment);
                    System.out.println("Quantity was " + quantity + " Shipment was " + shipment + " and itemPrice was " + itemPrice+" Total is " +total);
                } else if (quantity > 15) {
                    itemPrice -= 2;
                    shipment = 0;
                    total =((quantity * itemPrice) + shipment);
                    System.out.println("Quantity was " + quantity + " Shipment was " + shipment + " and itemPrice was " + itemPrice+" Total is " +total);


                } else {
                    total =((quantity * itemPrice) + shipment);
                    System.out.println("Quantity was " + quantity + " Shipment was " + shipment + " and itemPrice was " + itemPrice+" Total is " +total);
                }
            } else {
                System.out.println("Quantity cant be less than 1 ");

            }
            return total;
        }
    }



