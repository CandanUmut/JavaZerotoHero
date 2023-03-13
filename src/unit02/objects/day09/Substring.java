package unit02.objects.day09;

public class Substring {
    public static void main(String[] args) {
        String str1 = "SDET is the best ";
//        System.out.println(str1.substring(5,7));
//        System.out.println(str1.substring(0,4));
//

        String searchWord = "the";

        int indexof =str1.indexOf(searchWord);
        int lenght = searchWord.length();
        System.out.println(str1.substring(indexof,indexof+lenght));



    }
}
