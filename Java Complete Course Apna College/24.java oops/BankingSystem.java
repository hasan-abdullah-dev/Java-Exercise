import java.time.LocalDate;
import java.util.*;
//comment
class BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;
    private List<Transaction> transactions;

    public BankAccount(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount, balance));
            System.out.println("Deposit successful: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                transactions.add(new Transaction("Withdrawal", amount, balance));
                System.out.println("Withdrawal successful: $" + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printStatement() {
        System.out.println("Statement for Account: " + accountNumber);
        System.out.println("Account Name: " + accountName);
        System.out.println("Balance: $" + balance);
        System.out.println("Transactions:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction.toString());
        }
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, String accountName, double overdraftLimit) {
        super(accountNumber, accountName);
        this.overdraftLimit = overdraftLimit;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountName, double interestRate) {
        super(accountNumber, accountName);
        this.interestRate = interestRate;
    }
}

class Transaction {
    private LocalDate date;
    private String type;
    private double amount;
    private double balanceAfterTransaction;

    public Transaction(String type, double amount, double balanceAfterTransaction) {
        this.date = LocalDate.now();
        this.type = type;
        this.amount = amount;
        this.balanceAfterTransaction = balanceAfterTransaction;
    }

    @Override
    public String toString() {
        return date + " - " + type + ": $" + amount + ", Balance: $" + balanceAfterTransaction;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(123456, "John Doe", 500);
        checkingAccount.deposit(1000);
        checkingAccount.withdraw(200);
        checkingAccount.withdraw(1500);
        checkingAccount.printStatement();

        System.out.println();

        SavingsAccount savingsAccount = new SavingsAccount(987654, "Jane Smith", 0.05);
        savingsAccount.deposit(5000);
        savingsAccount.withdraw(1000);
        savingsAccount.printStatement();

        CheckingAccount checkingAccount1 = new CheckingAccount(987654, "Jane Smith", 500);
        checkingAccount1.printStatement();
    }
}
