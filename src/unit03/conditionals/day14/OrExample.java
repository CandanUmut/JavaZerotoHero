package unit03.conditionals.day14;

public class OrExample {
    public static void main(String[] args) {
        boolean havesubscribe= false;
        boolean freetrial = false;

        if (havesubscribe||freetrial){
            System.out.println("You can watch movies on disney");
        }else {
            System.out.println("Do you wanna be a subscriber or   you wanna try free trial");
        }
    }
}
