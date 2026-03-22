//Create custom exception handling for bank withdrawal scenario

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankAccount {

    int balance = 5000;

    void withdraw(int amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Error : Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("------------------------------------");
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance : " + balance);
            System.out.println("------------------------------------");
        }
    }
}

public class Program8 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();

        System.out.println("====================================");
        System.out.println("            BANK SYSTEM             ");
        System.out.println("====================================");

        System.out.println("Current Balance : 5000");
        System.out.print("Enter Amount to Withdraw : ");
        int amount = sc.nextInt();

        try {
            b.withdraw(amount);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("------------------------------------");
            System.out.println(e.getMessage());
            System.out.println("Withdrawal Failed");
            System.out.println("------------------------------------");
        }

        System.out.println("Transaction Completed");
        System.out.println("====================================");
    }
}