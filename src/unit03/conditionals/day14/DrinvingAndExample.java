package unit03.conditionals.day14;

public class DrinvingAndExample {

    public static void main(String[] args) {
        boolean hasdriverlicence = true;
        boolean noalcohol = false;

        if (hasdriverlicence&&noalcohol){
            System.out.println("You can drive");
        }else{
            System.out.println("You cannot drive suspended");
        }
    }
}
