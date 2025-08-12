public class SavingAccount extends Account
{
    private double interestRate;

    public SavingAccount(int accNumber, String holderName, double balance, double interestRate)
    {
        super(accNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void currentBalance() {
        System.out.println("Current balance in the Savings account is: "+ getBalance());
    }
}
