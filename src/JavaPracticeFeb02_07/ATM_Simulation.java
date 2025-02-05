package JavaPracticeFeb02_07;

import java.util.Scanner;

/*
*Fixed balance -> preassigned
* Input Withdrawal amount
*
*
*
*
 */
public class ATM_Simulation {
    public static void main(String[] args) {
        int balance = 42000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the withdrawal amount: ");
        int withdrawal = scanner.nextInt();
        if (withdrawal>10_000){
            System.out.println("You can withdraw only 10,000 at a time, thank you for banking with us!");
        } else if(withdrawal<balance){

            System.out.println("Sorry, you don't have enough balance");
            System.out.println("Do you want to check your balance, yes or no: ");
            String userInput = scanner.nextLine();
            if (userInput.equals("yes")){
                System.out.println("Your account balance is " + balance);
                System.out.println("Do you want to start over, yes or no");
            }


        }




    }
}
