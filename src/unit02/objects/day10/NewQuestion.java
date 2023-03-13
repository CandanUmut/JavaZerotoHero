package unit02.objects.day10;

public class NewQuestion {
    public static void main(String[] args) {
        String str1 = "SDET is the best" ;

        String searchWord = "";

        String firstWord = str1.substring(0, str1.indexOf(searchWord));
        int indexof =str1.indexOf(searchWord);
        int lenght = searchWord.length();
        String secondWord = str1.substring(indexof+lenght);
        System.out.println(firstWord+secondWord);


    }
}
