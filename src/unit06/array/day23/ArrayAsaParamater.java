package unit06.array.day23;

public class ArrayAsaParamater {
    public static void main(String[] args) {
        int[] intArra = {111,2,333,3,5,5,5};
        printFirstElement(intArra);
        printLastElement(intArra);
        System.out.println(printMiddleElement(intArra));
        int[]myArray= new int[2];
        myArray= printfirstandlastElement(intArra);
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);

    }

    public static void  printFirstElement(int[] numbers){
        System.out.println(numbers[0]);

    }
    public static void printLastElement(int[]numbers){
        System.out.println(numbers[numbers.length-1]);
    }
    public static int printMiddleElement(int[]numbers){
        if (numbers.length%2==0){
            return (numbers[(numbers.length/2)-1]);
        }else {
            return (numbers[(numbers.length/2)]);
        }

    }
    public static int[] printfirstandlastElement(int[]numbers){
        int[] arr= new int[2];
        arr[0]=numbers[0];
        arr[1]=numbers.length-1;
        return arr;

    }
}
