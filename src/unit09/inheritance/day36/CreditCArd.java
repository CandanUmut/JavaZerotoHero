package unit09.inheritance.day36;

public class CreditCArd {
    private double balance;


    public CreditCArd(double balance) {
        this.balance = balance;
    }


    public void transaction(double amount){

        balance = balance + amount ;


        System.out.println("Your Balance is " + balance);
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
