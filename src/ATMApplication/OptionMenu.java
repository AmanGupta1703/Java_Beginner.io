package ATMApplication;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat money = new DecimalFormat();

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException {
        System.out.println("------------------------------");
        int x = 1;
        do {
            try {
                data.put(1234, 5678);
                data.put(1596, 3578);

                System.out.println("Welcome to ATM project!");
                System.out.print("Enter the customer number: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.print("Enter the customer pin number: ");
                setPinNumber(menuInput.nextInt());
            } catch (Exception e) {
                System.out.println("\n" + "Invalid Characters(s). Only Numbers");
                x = 2;
            }
            int cn = getCustomerNumber();
            int pn = getCustomerPinNumber();

            if (data.containsKey(cn) && data.get(cn) == pn) {
                getAccountType();
            }
        } while (x != 2);
    }

    private void getAccountType() {
        System.out.println("------------------------------");
        System.out.println("Enter the Account Type.");
        System.out.println("1. Checking Account.");
        System.out.println("2. Saving Account.");
        System.out.println("3. Exit.");
        System.out.print("Choice: ");

        int response = menuInput.nextInt();

        switch (response) {
            case 1: getCheckingAccount();
                break;
            case 2:
                getSavingAccount();
                break;
            case 3:
                System.out.println("Bye, Thank you for using our services.");
                break;
        }
        System.out.println("------------------------------");
    }

    public void getSavingAccount() {
        System.out.println("------------------------------");
        System.out.println("Saving Account.");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Deposit Amount");
        System.out.println("4. Exit");
        System.out.print("Choice: ");

        int response = menuInput.nextInt();

        switch (response) {
            case 1:
                getCheckingBalance();
                getAccountType();
                break;
            case 2:
                getSavingWithDrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using our services");
                break;
        }
        System.out.println("------------------------------");
    }

    public void getCheckingAccount() {
        System.out.println("------------------------------");
            System.out.println("Checking Account.");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int response2 = menuInput.nextInt();

            switch (response2) {
                case 1:
                    getCheckingBalance();
                    getAccountType();
                    break;
                case 2:
                    getCheckingWithdrawInput();
                    getAccountType();
                    break;
                case 3:
                    getCheckingDepositInput();
                    getAccountType();
                    break;
                case 4:
                    System.out.println("Thank you for using our services");
                    break;
            }
        System.out.println("------------------------------");
    }
}

