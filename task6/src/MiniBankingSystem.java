import java.util.Scanner;
public class MiniBankingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int accountNumber = 5000;
        double balance = 1000;
        int choice;
        do {
            System.out.println("\nAccount Number: " + accountNumber);
            System.out.println("Current Balance: " + balance);
            System.out.println("\n1- Deposit");
            System.out.println("2- Withdraw");
            System.out.println("3- Exit");
            System.out.print("Choose option: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = input.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful.");
                        System.out.println("New Balance: " + balance);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = input.nextDouble();
                    if (withdraw <= 0) {
                        System.out.println("Invalid amount.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful.");
                        System.out.println("New Balance: " + balance);
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the system.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 3);
        input.close();
    }
}