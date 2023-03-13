package unit06.array.day26;

public class DetermineArrayCount {
    public static void main(String[] args) {
        String []arr = {"apple", "B","umut","apple","B"};
        int count = determineOccurrences(arr, "apple");
        System.out.println("Number of occurences " + count);

    }

    public static int determineOccurrences(String[] arr,String key) {
        int count = 0 ;
        for (String s: arr
             ) {
            if(s.equals(key)){
                count++;

        }





        }return count;
    }
}
