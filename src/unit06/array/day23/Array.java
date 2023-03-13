package unit06.array.day23;

public class Array {
    public static void main(String[] args) {
        int[]numberArray = new int[5];
        String [] words = new String[5];
        double[] doubleArray =new double[6];
        boolean[] booleans = new boolean[8];
        // how to update elements

        numberArray[2]=30;
        System.out.println(words[0]);
        System.out.println(numberArray[2]);
        numberArray[0]= numberArray[2] *3;
        System.out.println(numberArray[0]);
        //how to get elements
        System.out.println(booleans.length);
        doubleArray[1]=33.5;
        doubleArray[5]=doubleArray[1]/2;
        System.out.println(doubleArray[1]);
        System.out.println(doubleArray[5]);
        doubleArray[doubleArray.length-1]=100;
        System.out.println(doubleArray[doubleArray.length-1]);
        double[]scores={98.4, 87.3, 79.9};


    }
}
