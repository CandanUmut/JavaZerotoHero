package unit03.conditionals.day14;

public class ShortCircuit {
    //Statement1&&Statement2 if the first one false it has to be false Java is not gonna even check the second statement
    //Statement1||Statement2 if the first one true it has to be true

    public static void main(String[] args) {
//        numberofslices / numberofpeopl >= 2 you have enough piza=za
//                else you dont have enough pizza

        int numOfSlices =10;
        int numOfPeople =0;


        if(numOfPeople!=0 && numOfSlices/numOfPeople>= 2.0){
            System.out.println("You have enough pizza");
        }else{
            System.out.println("Not enough pizza for everyone");
        }

    }
}
