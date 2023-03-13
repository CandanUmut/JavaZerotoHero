package unit06.array.day27;

public class DuplivateValuesArray {
    public static void main(String[] args) {
        int [] firstArray = {1,2,3,4,3,2};

        System.out.println("this array has duplicates " +hasDuplicate(firstArray));

    }


    public static boolean hasDuplicate(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]==arr[j]){
                    System.out.println("busted  " + arr[i]);
                    return true;
                }


            }


        }return false;
    }
}
