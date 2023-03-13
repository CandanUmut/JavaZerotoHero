package unit02.objects.day10;

public class BurningIndex {
    public static void main(String[] args) {
        String str1 = "California";
        String searchedWord = "Cal";

        String firstWord = str1.substring(0, str1.indexOf(searchedWord));
        int indexof =str1.indexOf(searchedWord);
        int lenght = searchedWord.length();
        String secondWord = str1.substring(indexof+lenght);
        System.out.println(firstWord+secondWord);

    }
}
