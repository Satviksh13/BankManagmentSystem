import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\nBank Management System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Account Details");
            System.out.println("6. List All Accounts");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account holder name: ");
                    String holder = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter account type (Savings/Current): ");
                    String type = scanner.nextLine();
                    String accountNumber = bank.createAccount(holder, initialBalance, type);
                    System.out.println("Your account number is: " + accountNumber);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    String depositAccNum = scanner.nextLine();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(depositAccNum, depositAmount);
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    String withdrawAccNum = scanner.nextLine();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(withdrawAccNum, withdrawAmount);
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    String balanceAccNum = scanner.nextLine();
                    bank.checkBalance(balanceAccNum);
                    break;

                case 5:
                    System.out.print("Enter account number: ");
                    String detailsAccNum = scanner.nextLine();
                    bank.accountDetails(detailsAccNum);
                    break;

                case 6:
                    bank.listAllAccounts();
                    break;

                case 7:
                    System.out.println("Thank you for using the Bank Management System!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}