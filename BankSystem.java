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
    public double Account_Balance() {
        return balance;
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

// Test class with main method
public class BankSystem {
    public static void main(String[] args) {
        // Create a generic account
        Account acc = new Account("ACC123", "Alice Johnson", 2500.00);
        System.out.println("=== Account Details ===");
        acc.Display_Account_Detail();
        System.out.println("Account Balance: $" + acc.Account_Balance());

        System.out.println();

        // Create a saving account
        SavingAccount savAcc = new SavingAccount("SAV456", "Bob Smith", 5000.00, 3.5);
        System.out.println("=== Saving Account Details ===");
        savAcc.Display_Account_Detail();
        System.out.println("Saving Account Balance: $" + savAcc.Account_Balance());
    }
}
/*  
Output (Example)
=== Account Details ===
Account Number: ACC123
Account Holder: Alice Johnson
Balance: $2500.0
Account Balance: $2500.0

=== Saving Account Details ===
Account Number: SAV456
Account Holder: Bob Smith
Balance: $5000.0
Interest Rate: 3.5%
Saving Account Balance: $5000.0
*/