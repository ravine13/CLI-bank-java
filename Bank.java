import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }


    public void createAccount(Scanner scanner) {
        System.out.println("Enter Customer Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Initial Deposit Amount:");
        double initialDeposit = scanner.nextDouble();
        scanner.nextLine();

        if (initialDeposit < 0) {
            System.out.println("Initial deposit cannot be negative.");
            return;
        }

        Account newAccount = new Account(name, initialDeposit);
        accounts.add(newAccount);

        System.out.println("Account created successfully!");
        System.out.println("Account Number: " + newAccount.getAccountNumber());
    }

    public void depositMoney(Scanner scanner) {
        System.out.println("Enter Account Number:");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); 

        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.println("Enter Deposit Amount:");
            double amount = scanner.nextDouble();
            scanner.nextLine(); 

            if (amount <= 0) {
                System.out.println("Deposit amount must be greater than 0.");
            } else {
                account.deposit(amount);
                System.out.println("Deposit successful. New balance: " + account.getBalance());
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdrawMoney(Scanner scanner) {
        System.out.println("Enter Account Number:");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.println("Enter Withdrawal Amount:");
            double amount = scanner.nextDouble();
            scanner.nextLine(); 

            if (amount <= 0) {
                System.out.println("Withdrawal amount must be greater than 0.");
            } else if (amount > account.getBalance()) {
                System.out.println("Insufficient balance.");
            } else {
                account.withdrawal(amount);
                System.out.println("Withdrawal successful. New balance: " + account.getBalance());
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public void viewAccountDetails(Scanner scanner) {
        System.out.println("Enter Account Number:");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); 

        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.println("Account Details:");
            System.out.println(account);
        } else {
            System.out.println("Account not found.");
        }
    }


    private Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}
