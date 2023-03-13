package unit04.iteration.day16;

public class WhileBreakKeyWord {
    public static void main(String[] args) {
        int counter =8;
        while(true){
            if(counter>10){
                break;
            }
            System.out.println("hello" + counter);
            counter++;
        }
    }
}
