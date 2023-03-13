package unit06.array.day27;

public class FindHowManyNegative {
    public static void main(String[] args) {
        int[]arr = {-1,3,5,6,7,1,2,-5};
        System.out.println(numOfNegatives(arr));

    }
    public static int numOfNegatives(int[]arr){

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                count++;
            }

        }return count;
    }



}
