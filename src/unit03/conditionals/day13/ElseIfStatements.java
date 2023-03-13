package unit03.conditionals.day13;

public class ElseIfStatements {
    public static void main(String[] args) {
        double hours =123.5;
        double total= 0.0;
        //less than or equal to 2 hours 30 dollars ficed
        //more than two hours less than 4 hours hourly rate

        if (hours <=2){
            total =30;

        } else if (hours <=4) {
            total = hours *13;
        }else {
            total = hours *12;

        }
        System.out.println("Your total is " + total);

        }
    }
