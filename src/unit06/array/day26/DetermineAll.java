package unit06.array.day26;

public class DetermineAll {
    public static void main(String[] args) {
        int[] arr = {1, 1};

        System.out.println("There is the number inside of the array " + determineAny(arr, 1));

    }

    public static boolean determineAny(int[] arr, int key) {

        for (int number:arr){
            if(number!=key)
                return false;


            }
            return true;


        }

    }

