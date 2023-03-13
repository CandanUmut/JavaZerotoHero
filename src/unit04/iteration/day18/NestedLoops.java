package unit04.iteration.day18;

public class NestedLoops {
    public static void main(String[] args) {
        for(int outer=0; outer<3;outer++){
            for(int inner=0; inner<4;inner++){
                System.out.print( outer+ "  inner  "+inner);


            }
            System.out.print(" ");
        }

    }

}
