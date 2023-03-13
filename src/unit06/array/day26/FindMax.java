package unit06.array.day26;

public class FindMax {
    public static void main(String[] args) {
        int []arr = {1,3,5,6,1,2,8,12312};
        System.out.println(findMax(arr));

    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int number:arr
             ){
            if(number>max){
                max = number;

            }

        }return max;
    }
}
