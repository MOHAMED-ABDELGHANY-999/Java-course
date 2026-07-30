import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password = 2006;
        int attempts = 0;
        boolean login = false;
        while (attempts < 2) {
            System.out.print("Enter password: ");
            int userPassword = input.nextInt();
            if (userPassword == password) {
                login = true;
                break;
            } else {
                attempts++;
            }
        }
        if (login) {
            int choice;
            do {
                System.out.println("1. Welcome Message");
                System.out.println("2. Exit");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Welcome to Elkhal Land Transport");
                        break;
                    case 2:
                        System.out.println("Exit");
                        break;
                }
            } while (choice != 2);
        } else {
            System.out.println("Access Denied");
        }
    }
}