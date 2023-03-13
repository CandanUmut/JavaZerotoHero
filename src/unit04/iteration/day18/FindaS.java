package unit04.iteration.day18;

public class FindaS {
    public static void main(String[] args) {
        String str1 = "umut";
        int a = 0;
        String str2 ="a";
        String str3="e";
        String str4="i";
        String str5="o";
        String str6="u";

        for(int i=0; i<str1.length(); i++){
            if(str1.substring(i, i+1).equals(str2) || (str1.substring(i, i+1).equals(str3))||(str1.substring(i, i+1).equals(str4))||(str1.substring(i, i+1).equals(str5))||(str1.substring(i, i+1).equals(str6))){

                a++;

            }

        }

        System.out.println(a);
    }

//    public static boolean isVovel(String check){
//
//
//    }


}
