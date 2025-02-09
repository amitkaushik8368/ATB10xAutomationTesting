package JavaPracticeFeb08_14;

public class BankApp {
    public static void main(String[] args) {
      //  BankAccount customer1 = new BankAccount();    //customer1 is Object reference and new BankAccount() is object creation
        BankAccount customer2 = new BankAccount("Amit Sharma", 123456789L, 2000.00F);  // Constructor Overloading

        BankAccount customer3 = new BankAccount("Shubham Sharma", 12345678L,4.0F);
        customer2.depositAmount(500.00F);
        customer2.displayBalance();
        customer2.withdrawAmount(2000.00f);
        customer2.displayBalance();


        customer3.depositAmount(1000.00F);
        customer3.displayBalance();
        customer3.withdrawAmount(30.0F);
        customer2.displayBalance();

    }
}
