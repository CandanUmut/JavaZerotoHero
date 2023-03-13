package unit09.inheritance.day36;

public class RewardCard extends CreditCArd{
    private double rewardRate;
    private double rewardBalance;

    public RewardCard(double balance, double rewardRate, double rewardBalance) {
        super(balance);
        this.rewardRate = rewardRate;
        this.rewardBalance = rewardBalance;
    }

    public double getRewardRate() {
        return rewardRate;
    }

    public void setRewardRate(double rewardRate) {
        this.rewardRate = rewardRate;
    }

    public double getRewardBalance() {
        return rewardBalance;
    }

    public void setRewardBalance(double rewardBalance) {
        this.rewardBalance = rewardBalance;
    }

    @Override
    public void transaction(double amount) {
        super.transaction(amount);
        rewardBalance = amount*rewardRate;
        System.out.println("Reward Balance is " +rewardBalance);

    }
}
