package unit08.array2d.day32;

public class TwoDArraysinmethods {
    public static void main(String[] args) {
        String [][] favFruits= {{"Apple","banana"},{"Strawberry", "kiwi"},{"pineapple"}};
        printElements(favFruits);



    }//name of the method print all elements , it will get a 2D string array as a parameter and it will print all the elements in the 2D array to the screen
    //using the for or foreach loop
    public static void printElements(String[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]+ " ");

            }
            System.out.println();

        }
    }
}
