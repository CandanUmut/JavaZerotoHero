package unit04.iteration.day18;

public class PrimeOrNot {
    public static void main(String[] args) {
        String str1 ="World Cup";
        for(int i = 0 ; i<str1.length(); i++){
            System.out.println(str1.substring(str1.length()-(i+1)));
        }
        System.out.println("Reversed Version");
        for(int i=str1.length()-1; i>0;i--){
            System.out.println(str1.substring(i,i+1));
        }

        System.out.println("CHaratVersionnn");
        for(int i=str1.length()-1; i>0;i--){
            System.out.println(str1.charAt(i));

    }

}
}
