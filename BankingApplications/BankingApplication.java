package BankingApplications;
import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Aman", 171003);
        bankAccount.showMenu();
    }
}

class BankAccount {
    String customerName;
    int customerID;
    int previousTransactions;
    int balance;

    BankAccount(String cName, int cID) {
        this.customerName = cName;
        this.customerID = cID;
    }

    void deposit(int amount) {
        if (balance != 0) {
            balance = balance + amount;
            previousTransactions = amount;
        }
    }

    void withdraw(int amount) {
        if (balance != 0) {
            balance = balance - amount;
            previousTransactions = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransactions > 0) {
            System.out.print("Deposited Amount : " + previousTransactions);
        } else if (previousTransactions < 0) {
            System.out.println("Amount Withdrawn : " + Math.abs(previousTransactions));
        } else {
            System.out.println("No Transaction Ocuured.");
        }
    }

    void showMenu() {

        Scanner sc = new Scanner(System.in);
        char option = ' ';

        System.out.print("Welcome "+ customerName);
        System.out.print("\nYour cutomer ID is "+ customerID);
        System.out.println("\n=================================================================");
        System.out.println("A. Check Balance.");
        System.out.println("B. Deposit.");
        System.out.println("C. Withdraw.");
        System.out.println("D. Previous Transactions.");
        System.out.println("E. Exit the program.");
        System.out.println("=================================================================");

        do {
            System.out.println("=================================================================");
            System.out.print("Enter an option : ");
            option = sc.next().charAt(0);
            System.out.println("\n=================================================================");

            switch(option) {
                case 'A': 
                    System.out.println("=================================================================");
                    System.out.print("Balance : "+ balance);
                    System.out.println("\n=================================================================");
                    System.out.println("\n");
                break;
                case 'B':
                    System.out.println("=================================================================");
                    System.out.print("Enter an amount to deposit : ");
                    System.out.println("\n=================================================================");
                    int depositAmount = sc.nextInt();
                    deposit(depositAmount);
                break;
                
                case 'C':
                    System.out.println("=================================================================");
                    System.out.print("Enter an amount to withdraw : ");
                    System.out.println("\n=================================================================");
                    int withdrawAmount = sc.nextInt();
                    withdraw(withdrawAmount);
                break;

                case 'D':
                    System.out.println("=================================================================");
                    System.out.println("Previous Transaction.");
                    getPreviousTransaction();
                    System.out.println("\n=================================================================");
                break;

                case 'E':
                    System.out.println("=================================================================");
                    System.out.println("Exited the program.");
                    System.out.println("\n=================================================================");
                break;

                default:
                    System.out.println("Invalid Input.\nEnter a valid option(i.e A-E)");
                break;
            }
        } while(option != 'E');
        System.out.println("Thank you for using our services.");
    }

}
