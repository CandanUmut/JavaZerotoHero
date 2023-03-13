package unit06.array.day24;

public class ArrayInitialezeWithLoop {
    public static void main(String[] args) {
        int[]arr= new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=i*10;
            System.out.println(arr[i]);




        }
        int[]arr2=new int[7];
        for (int i = 0; i < arr2.length ; i+=2) {
            arr2[i]=i*10;
            System.out.println(arr2[i]);


        }
    }
}
