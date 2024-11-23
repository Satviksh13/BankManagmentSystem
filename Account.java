public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String accountType;

    public Account(String accountNumber, String accountHolder, double initialBalance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.accountType = accountType;
    }

    public String getAccountNumber() { 
        return accountNumber; 
    }
    public String getAccountHolder() {
         return accountHolder;
    }
    public double getBalance() {
         return balance;
    }
    public String getAccountType() {
         return accountType;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New Balance: $" + balance);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + accountNumber + '\'' +
                ", holder='" + accountHolder + '\'' +
                ", balance=$" + balance +
                ", type='" + accountType + '\'' +
                '}';
    }
}

