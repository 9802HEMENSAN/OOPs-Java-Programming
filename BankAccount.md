Here's the updated Java program with an added **`Withdraw()`** function in the `Saving_Account` class.

---

### ✅ New Method:

* **`Withdraw(double amount)`**

  * Checks if enough balance is available
  * Deducts the amount if valid
  * Otherwise, shows an error message

---

### ✅ Updated Java Program:

```java
// Base class: Account
class Account {
    protected String accountNumber;
    protected double balance;

    // Constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

// Derived class: Saving_Account
class Saving_Account extends Account {

    // Constructor
    public Saving_Account(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Display account details
    public void Display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }

    // Deposit method
    public void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void Withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

// Main class to test
public class BankTest {
    public static void main(String[] args) {
        // Create a saving account
        Saving_Account myAccount = new Saving_Account("SA123456", 1000.0);

        // Display current account status
        myAccount.Display();

        // Perform deposit
        myAccount.Deposit(500.0);

        // Perform withdrawal
        myAccount.Withdraw(300.0);

        // Try withdrawing more than balance
        myAccount.Withdraw(1500.0);

        // Final account status
        myAccount.Display();
    }
}
```

---

### ✅ Sample Output:

```
Account Number: SA123456
Current Balance: $1000.0
Deposited: $500.0
Withdrawn: $300.0
Insufficient balance.
Account Number: SA123456
Current Balance: $1200.0
```

---
 