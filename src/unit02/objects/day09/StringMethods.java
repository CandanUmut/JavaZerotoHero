package unit02.objects.day09;

public class StringMethods {
    public static void main(String[] args) {
        //lenght
        String str1 = "Programming";
        int lenghtOfStr = str1.length();
        System.out.println(str1.length());
        System.out.println(lenghtOfStr);
// indexof
        String str2 = "Programming with Java";
        System.out.println(str2.indexOf("Java"));
        System.out.println(str2.indexOf("java"));
        String str3 = "Hello";
        System.out.println(str3.indexOf("o"));
// substring
        System.out.println(str3.substring(1,3));

        String str4 = "Hello Testers";
        System.out.println(str4.substring(6,12));







    }
}
