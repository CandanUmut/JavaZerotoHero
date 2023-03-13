package unit03.conditionals.day12;

public class ReturnBoolean {
    private int steps;

    public ReturnBoolean(int steps) {
        this.steps = steps;
    }

    public boolean checkGoalReached() {
        if(steps>=10000){
            System.out.println("Congrats!!");
            return true;
        }
        return false;

    }
}
