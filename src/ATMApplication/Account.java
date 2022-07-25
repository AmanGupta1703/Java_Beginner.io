package ATMApplication;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int customerNumber;
    private int customerPinNumber;
    private double checkingBalance;
    private double savingBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$' ###, ##0.00");

    public int setCustomerNumber(int customer) {
        this.customerNumber = customer;
        return customerPinNumber;
    }
    public int setPinNumber(int pinNumber) {
        this.customerPinNumber = pinNumber;
        return customerPinNumber;
    }
    public int getCustomerNumber() {
        return this.customerNumber;
    }
    public int getCustomerPinNumber() {
        return this.customerPinNumber;
    }
    public double getCheckingBalance()    {
        return checkingBalance;
    }
    public double getSavingBalance() {
        return savingBalance;
    }
    public double calcSavingWithDrawInput(double savingWithdrawAmount) {
        savingBalance = (savingBalance - savingWithdrawAmount);
        return savingBalance;
    }
    public double calcSavingDepositInput(double savingDepositAmount) {
        savingBalance = (savingBalance + savingDepositAmount);
        return savingBalance;
    }
    public double calcCheckingWithDrawInput(double checkingWithdrawAmount) {
        checkingBalance = (checkingBalance + checkingWithdrawAmount);
        return checkingBalance;
    }
    public double calcCheckingDepositInput(double checkingDepositAmount) {
        checkingBalance = (checkingBalance + checkingDepositAmount);
        return checkingBalance;
    }

    public void getSavingWithDrawInput() {
        System.out.println("------------------------------");
        System.out.println("Saving Balance: "+ moneyFormat.format(savingBalance));
        System.out.print("Amount to withdraw from the saving account: ");

        double savingWithdrawAmount = input.nextDouble();

        if((savingWithdrawAmount - savingBalance) >= 0) {
            calcSavingWithDrawInput(savingWithdrawAmount);
            System.out.println("New Saving Balance: "+ moneyFormat.format(savingBalance));
        } else {
            System.out.println("Money cannot be negative ):");
        }
        System.out.println("------------------------------");
    }
    public void getCheckingWithdrawInput() {
        System.out.println("------------------------------");
        System.out.println("Checking Balance: "+ moneyFormat.format(checkingBalance));
        System.out.print("Amount to withdraw from the checking account: ");

        double checkingWithdrawAmount = input.nextDouble();

        if((checkingWithdrawAmount - checkingBalance) >= 0) {
            calcCheckingWithDrawInput(checkingWithdrawAmount);
            System.out.println("New Checking Balance: "+ moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Money cannot be negative ):");
        }
        System.out.println("------------------------------");
    }
    public void getSavingDepositInput() {
        System.out.println("------------------------------");
        System.out.println("Saving Balance: "+ moneyFormat.format(savingBalance));
        System.out.print("Amount to deposit to the saving account: ");

        double savingDepositAmount = input.nextDouble();

        if((savingDepositAmount + savingBalance) >= 0) {
            calcSavingDepositInput(savingDepositAmount);
            System.out.println("New Saving Balance: "+ moneyFormat.format(savingBalance));
        } else {
            System.out.println("Money cannot be negative ):");
        }
        System.out.println("------------------------------");
    }
    public void getCheckingDepositInput() {
        System.out.println("------------------------------");
        System.out.println("Checking Balance: "+ moneyFormat.format(checkingBalance));
        System.out.print("Amount to deposit to the checking account: ");

        double checkingDepositAmount = input.nextDouble();

        if((checkingDepositAmount + checkingBalance) >= 0) {
            calcCheckingDepositInput(checkingDepositAmount);
            System.out.println("New Checking Balance: "+ moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Money cannot be negative ):");
        }
        System.out.println("------------------------------");
    }
}

