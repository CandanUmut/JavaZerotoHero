package unit06.array.day26;

public class DetermineArrayInt {
    public static void main(String[] args) {
        int []arr = {1,2,5,1,51,23,41,1,1,23,4,555,1};
        int count = determineOccurrences(arr, 1);
        System.out.println("Number of occurences " + count);

    }

    public static int determineOccurrences(int[] arr,int key) {
        int count = 0 ;
        for (int num: arr
        ) {
            if(num ==  key){
                count++;

            }





        }return count;
    }
}

