package unit08.array2d.day33.Questions;

public class Example2 {
    public static void main(String[] args) {
        int[][] twoDNumbers = {
                {11, 12, 13, 14},
                {16, 17, 18, 19, 20},
                {21, 22, 23},
                {26, 27, 28, 29}
        };
        System.out.println(returnMinValue(twoDNumbers));
        System.out.println(returnMaxValue(twoDNumbers));

        boolean[][] booleanValues = {
                {true,true,false,true},
                {true,true,false,true},
                {false,false,false,true},
                {false,false,false,false}
        };

        System.out.println(returnHowManyTrue(booleanValues));


    }

    public static int returnMinValue(int[][] numbers) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] < min) {
                    min = numbers[i][j];
                }

            }
        }
        return min;
    }

    public static int returnMaxValue(int[][] numberr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numberr.length; i++) {
            for (int j = 0; j < numberr[i].length; j++) {
                if (numberr[i][j] > max) {
                    max = numberr[i][j];
                }


            }

        }
        return max;

    }

    public static int returnHowManyTrue(boolean[][] arr) {
        int count = 0;
        double total =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total++;

                if (arr[i][j] == true) {

                    count++;
                }


            }

        }
        double ratio =count/(total-count);
        System.out.println("true /false : "+ratio);
        System.out.println("Total trues : ");
        return count;

    }
}

