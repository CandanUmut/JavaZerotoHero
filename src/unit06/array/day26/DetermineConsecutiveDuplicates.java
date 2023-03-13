package unit06.array.day26;

public class DetermineConsecutiveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,0,1,4433, 2,1,2,3,2,22,22 };

        System.out.println("There is consecutive inside of the array " + determineAny(arr));

    }

    public static boolean determineAny(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;

            }



        }
        return false;
    }
}
