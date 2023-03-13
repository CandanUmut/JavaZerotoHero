package unit06.array.day27;

public class ReverseArray {
    public static void main(String[] args) {
        int [] firstArray= {1,2,3,4,5,6,7,8,9,10};
        firstArray =reverseArray(firstArray);
        printArr(firstArray);



    }

    public static int[] reverseArray(int[] firstArray){
        int[] reversedArray= new int[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            reversedArray[reversedArray.length-1-i]=firstArray[i];


        }
        return reversedArray;
    }
    public static void printArr(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
