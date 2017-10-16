package domain;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double initBalance, double interestRate) {
        balance = initBalance;
        this.interestRate = interestRate;
    }

    public void addInterestRate(){
        balance += balance * (1 + interestRate/100);
    }

    public double getInterestRate() {
        return interestRate;
    }

}

