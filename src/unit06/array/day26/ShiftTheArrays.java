package unit06.array.day26;

public class ShiftTheArrays {
    public static void main(String[] args) {
        int[] firstArray = {1, 1,1323,4123,123};

        int [] secondArray = new int[firstArray.length];

        for (int i = 0; i < firstArray.length-1 ; i++) {
             secondArray[i + 1] = firstArray[i] ;



        }secondArray[0]=firstArray[firstArray.length-1];
        firstArray= secondArray;
        System.out.println("Shifted array ; ");
        for (int num:firstArray
             ) {
            System.out.print(num+ "  ");

        }



    }







    }
