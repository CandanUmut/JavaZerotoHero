package unit03.conditionals.day14;

public class DiceGame {
    public static void main(String[] args) {
        for(int i = 0; i < 6 ;i++){
            int dice1 = (int)(Math.random()*6)+1;
            int dice2 = (int)(Math.random()*6)+1;

            if (dice1==dice2 || dice1+dice2 >=8){
                System.out.println("You win dice1 was "+dice1+" and dice2 was "+dice2);
            }else{
                System.out.println("You lose dice1 was "+dice1+" and dice2 was "+dice2);
            }

        }

    }
        }

