package unit04.iteration.day18;

public class LowercaseLetterCounter {
    public static void main(String[] args) {
        String str1 ="argentina";
        for(int i=str1.length()-1; i>0;i--){
            String a =(str1.substring(i,i+1));
            if(a.equals("a")){
                System.out.println(1);;
            }
        }

}}
