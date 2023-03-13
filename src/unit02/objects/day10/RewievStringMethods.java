package unit02.objects.day10;

public class RewievStringMethods {
    public static void main(String[] args) {

        String str1 = "California" ;
        System.out.println(str1.length());
        System.out.println(str1.indexOf("for"));
        System.out.println(str1.substring(1,4)+(str1.substring(0,2)+(str1.substring(7,8))));
        System.out.println(str1.substring(7));
        System.out.println(str1.substring(str1.indexOf("n")));

    }


}
