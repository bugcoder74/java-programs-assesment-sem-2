import java.util.Scanner;

class CaseStudy3 {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Transaction denied. Insufficient balance.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrawn: ₹" + amount);
        }
    }

    public void displayBalance() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("987654321", "Rahul Sharma", 5000.0);
        account.displayBalance();
        account.deposit(1500.0);
        account.withdraw(2000.0);
        account.withdraw(6000.0);
        account.displayBalance();
    }
}
