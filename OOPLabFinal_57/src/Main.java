import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number: ");
        int accNumber = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Account Holder's Name: ");
        String holderName = sc.nextLine();


        System.out.println("Enter Balance: ");
        double balance = sc.nextDouble();

        sc.nextLine();
        System.out.println("Enter Transaction date: ");
        String date = sc.nextLine();

        Account a = new Account(accNumber,holderName,balance);

        try{
            a.setBalance(balance);
        }catch(LowBalanceException e){
            System.out.println("Checked Balance.\nException : " +e.getMessage());
        }finally{
        System.out.println("Main Account Balance: "+balance);
    }

        a.accountInfo();
        a.currentBalance();
        a.currentBalance(date);



        System.out.println("Enter amount to be sent: ");
        int moneys = sc.nextInt();
        a.sendMoney(moneys);

        System.out.println("Enter amount to be received: ");
        int moneyr = sc.nextInt();
        a.receiveMoney(moneyr);


    }
}