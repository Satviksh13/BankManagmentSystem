import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts;
    private int accountCounter;

    public Bank() {
        this.accounts = new HashMap<>();
        this.accountCounter = 1000;
    }

    public String createAccount(String accountHolder, double initialBalance, String accountType) {
        String accountNumber = "ACC" + accountCounter++;
        Account account = new Account(accountNumber, accountHolder, initialBalance, accountType);
        accounts.put(accountNumber, account);
        System.out.println("Account created successfully!");
        return accountNumber;
    }

    public void deposit(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public void checkBalance(String accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Current Balance: $" + account.getBalance());
        } else {
            System.out.println("Account not found");
        }
    }

    public void accountDetails(String accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println(account);
        } else {
            System.out.println("Account not found");
        }
    }

    public void listAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts exist in the bank");
            return;
        }
        System.out.println("\nAll Bank Accounts:");
        for (Account account : accounts.values()) {
            System.out.println(account);
        }
    }
}

