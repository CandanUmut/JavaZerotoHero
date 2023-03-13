package unit06.array.day27;

public class PrintIon {
    public static void main(String[] args) {
        String[]arr = {"aion","kaka","solition"};
        printIon(arr);




    }

    public static void printIon(String[]arr){
        String a = "ion";
        String b = null;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].endsWith(a)){
                b = arr[i];
                System.out.println(b);

            }

        }

    }
}
