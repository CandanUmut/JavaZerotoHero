package unit03.conditionals.day14;

public class NestedIfStatements {
    public static void main(String[] args) {
        boolean hasDriverLicence= true;
        boolean clearBackgroun = false;
        if (hasDriverLicence){
            if(clearBackgroun){
                System.out.println("You can drive for the company");
            }else {
                System.out.println("You should have a clear backgroud");
            }

        }else{
            System.out.println("You should have a driver licence");
        }


    }

}
