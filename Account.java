

public class Account{

    private static int nextAccountNumber = 1001;

    private int accountNumber;
    private String customerName;
    private double balance;

    public Account(String customerName,double initialDeposit){
        this.accountNumber = nextAccountNumber++;
        this.customerName = customerName;
        this.balance = initialDeposit;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public String customerName(){
        return customerName;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
             balance += amount;
        } else{
            System.out.println("Deposit must be positive");
        }
    }
    public void withdrawal(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        } else{
            System.out.println("Invalid withdrawal amount.");
        }
    }
    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
               "\nCustomer Name: " + customerName +
               "\nBalance: " + balance;
    }
}