/*  
It demonstrates:
An Account base class with:
Appropriate constructor
Methods: Display_Account_Detail() and Account_Balance()

A SavingAccount class that:
Inherits from Account
Has its own constructor
Overrides the Display_Account_Detail() method 

✅ Assumptions:
Each account has accountNumber, accountHolderName, and balance.
Savings accounts may have an interestRate.
*/
import java.util.Scanner;
// Base class: Account
class Account {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    // Constructor for Account
    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to display account details
    public void Display_Account_Detail() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    // Method to return account balance
    public void Account_Balance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// Derived class: SavingAccount
class SavingAccount extends Account {
    private double interestRate;

    // Constructor for SavingAccount
    public SavingAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    // Overridden method to display saving account details
    @Override
    public void Display_Account_Detail() {
        super.Display_Account_Detail(); // Optional: Show base details
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

 // Main class with CLI
public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Create Savings Account ===");
        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine();

        System.out.print("Enter Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter Interest Rate: ");
        double rate = scanner.nextDouble();

        SavingAccount savings = new SavingAccount(accNum, name, balance, rate);

        System.out.println("\n=== Account Details ===");
        savings.Display_Account_Detail();

        System.out.println("\n=== Account Balance ===");
        savings.Account_Balance();

        scanner.close();
    }
}
