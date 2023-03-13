package unit06.array.day26;

public class DetermineanyInArray {
    public static void main(String[] args) {
        int []arr = {1,2,5,1,51,23,41,1,1,23,4,555,1};

        System.out.println("There is the number inside of the array " + determineAny(arr,1235));

    }

    public static boolean determineAny(int[] arr, int key) {
       boolean isInthere = false;
        for (int num: arr
        ) {
            if(key ==  num){
                isInthere = true;

            }





        }return isInthere;
    }
}
