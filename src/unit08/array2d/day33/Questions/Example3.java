package unit08.array2d.day33.Questions;

public class Example3 {
    public static void main(String[] args) {
        int[][] twoDNumbers = {
                {11, 12, 13, 14},
                {16, 17, -18, 19, 20},
                {21, 22, 23},
                {26, 27, 28, -29}};

        System.out.println(returnSum(twoDNumbers));





    }


    public static int returnSum(int[][] numberr) {
        int sum = 0;
        for (int i = 0; i < numberr.length; i++) {
            for (int j = 0; j < numberr[i].length; j++) {
                    sum += numberr[i][j];



            }

        }
        return sum;

    }
}
