package unit06.array.day25.arrayalgorithms;

public class SumoftheValuesOfArray {
    public static void main(String[] args) {

        int[] arr = {31, 3};

        System.out.println(getAverage(arr));


        int sum= 0 ;

        for (int i = 0; i < arr.length; i++){
            int number = arr[i];
            sum+=number;

        }
        System.out.println(sum);
    }
    public static int getAverage(int[] arr){
        int sum=0;
        int average=0;


        for (int i = 0; i < arr.length; i++){
            int number = arr[i];
            sum+=number;
            average = sum/arr.length;

    }return average ;



        }


}
