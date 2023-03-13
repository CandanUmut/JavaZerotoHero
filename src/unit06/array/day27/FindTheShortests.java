package unit06.array.day27;

public class FindTheShortests {
    public static void main(String[] args) {
        String[] array = {"umut", "omosyus", "candan", "caat", "a"};
        System.out.println(findTheShortestWord(array));


    }

    public static String findTheShortestWord(String[] arr) {
        String shortest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < shortest.length()) {
                shortest = arr[i];
            }

        }
        return shortest;
    }
}
