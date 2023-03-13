package unit06.array.day24;

public class ArrayPrintSameLine {
    public static void main(String[] args) {
        int[] numbers = {3,5,564,234,2,134,23,76,123,5123};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ "  ");

        }
        int[] numbers1 = {3,5,564,234,2,134,23,76,123,5123};

        for (int i = 0; i < numbers1.length; i+=2) {
            System.out.println(numbers1[i]+ "  ");



        }
}
}
