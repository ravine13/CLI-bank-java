import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("Welcome to Sunset bank, where your money is our priority");
        boolean running = true;

        while (running){
            System.out.println("\nplease select an option");
            System.out.println("1. create an Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. view Account Details");
            System.out.println("5. Exit");


            int choice = scanner.nextInt();
            scanner.nextLine();


            switch(choice){
                case 1:
                    bank.createAccount(scanner);
                    break;
                case 2:
                    bank.depositMoney(scanner);
                    break;
                case 3: 
                    bank.withdrawMoney(scanner);
                    break;
                case 4: 
                    bank.viewAccountDetails(scanner);
                    break;
                case 5: 
                    running = false;
                    System.out.println("Thank you for choosing sunset bank, we are you!!!");
                    break;
                default:
                    System.out.println("invalid option");
            }

        }
        scanner.close();
    }
}