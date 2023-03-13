package unit02.objects.day10;

public class Question2 {
    public static void main(String[] args) {
        String string1 = "Java Strings";
        String string2 ="Techno Study";

        String secondword = string1.substring(0,4);
        String firstword=string2.substring(7);
        System.out.println(firstword+" "+secondword);

        String searchWord = "Java";

        int indexof =string1.indexOf(searchWord);
        int lenght = searchWord.length();
        String first =(string1.substring(indexof,indexof+lenght));

        String searcsecond = "Study";

        int indexof1 =string2.indexOf(searcsecond);
        int lenght1 = searcsecond.length();
        String secondword1 =(string2.substring(indexof1,indexof1+lenght1));

        System.out.println(secondword1+" "+first);



    }
}
