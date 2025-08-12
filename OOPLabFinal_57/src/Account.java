public class Account implements Transaction
{
    private int accNumber;
    private String holderName;
    private double balance;

    public Account(int accNumber, String holderName, double balance)
    {
        this.accNumber = accNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) throws LowBalanceException
    {
        if(balance<500.0) {
            throw new LowBalanceException("Can't set below 500 taka");
        }
        else
            this.balance = balance;
    }

    public void accountInfo()
    {
        System.out.println("Holder name: "+ getHolderName());
        System.out.println("Account number: "+ getAccNumber());

    }

    public void currentBalance()
    {
        System.out.println("Current Balance: "+ getBalance());

    }

    public void currentBalance(String date)
    {
        System.out.println("Current balance is "+ getBalance()+ " on "+ date);

    }

    @Override
    public void sendMoney(int money)
    {
        if(balance>=0) {
            balance = balance - money;

            System.out.println("Balance after sending amount "+ getBalance() + " :  " + balance);
        }
        else
            System.out.println("Invalid amount!");
    }

    @Override
    public void receiveMoney(int money)
    {
            balance = balance + money;

            System.out.println("Balance after sending amount "+ getBalance() + " :  " + balance);
    }


}
