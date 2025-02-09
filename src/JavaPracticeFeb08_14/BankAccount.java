package JavaPracticeFeb08_14;

public class BankAccount {

    String customerName;
    long accountNumber;
    float balance;

    BankAccount()
    {
        System.out.println("I am constructor and new Object has been created");
    }
    BankAccount(String customerName, long accountNumber, float balance)
    {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void depositAmount(float amount)
    {
        if (amount < 0)
            System.out.println("Invalid Amount");
        else {
            System.out.println(balance);
            balance = balance + amount;
            System.out.println("Amount Deposited Successfully");
        }

    }

    void withdrawAmount(float amount)
    {
        if (amount>0 && amount <= balance)
        {
            balance = balance-amount;
            System.out.println("Amount withdrawn successfully");
        }
        else System.out.println("Insufficient balance or invalid amount");
    }

    void displayBalance()
    {
        System.out.println("Your account balance is : " + balance);
    }





}
