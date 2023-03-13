package unit06.array.day27;

public class FindTheMaxElementIndex {
    public static void main(String[] args) {
        int[]arr={1,412,5123,51233};
        System.out.println(maxIndex(arr));

    }

    public static int maxIndex(int[]arr){
        int index = 0;

        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i+1]>arr[index]){
                index=i;



            }


        }
        return index;
    }
}
