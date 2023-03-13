package unit06.array.day26;

public class ShiftTheArraysLeft {public static void main(String[] args) {
    int[] firstArray = {1, 1,1323,4123,123};

    int [] secondArray = new int[firstArray.length];

    for (int i = firstArray.length-1; i >0  ; i--) {
        secondArray[i - 1] = firstArray[i] ;



    }secondArray[firstArray.length-1]=firstArray[0];
    firstArray= secondArray;
    System.out.println("Shifted array ; ");
    for (int num:firstArray
    ) {
        System.out.print(num+ "  ");

    }

}}
