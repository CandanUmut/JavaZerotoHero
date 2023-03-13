package unit09.inheritance.day36;

public class CreditCardMain {
    public static void main(String[] args) {
        CreditCArd creditCArd=new CreditCArd(200);
        RewardCard rewardCard=new RewardCard(1000,1,10);
        creditCArd.transaction(500);
        rewardCard.transaction(500);
        creditCArd.transaction(200);




    }



}
