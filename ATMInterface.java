import java.util.Scanner;

class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount Deposited Successfully.");
            System.out.println("Current Balance: $" + balance);
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Enter a valid amount.");
        }
        else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        }
        else {
            balance = balance - amount;
            System.out.println("Please collect your cash.");
            System.out.println("Remaining Balance: $" + balance);
        }
    }

    // Check Balance
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Display Account Info
    public void displayDetails() {
        System.out.println("\nAccount Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
    }
}

class ATM {

    private BankAccount account;

    ATM(BankAccount account) {
        this.account = account;
    }

    public void start() {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n========== ATM MENU ==========");
            System.out.println("1. Account Details");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    account.displayDetails();
                    break;

                case 2:
                    account.checkBalance();
                    break;

                case 3:
                    System.out.print("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 4:
                    System.out.print("Enter Withdraw Amount: ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 5:
                    System.out.println("Thank you for using ATM.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);
    }
}

public class ATMInterface {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(
                "Munazza Hijab",
                123456,
                5000
        );

        ATM atm = new ATM(account);

        atm.start();
    }
}