import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstNumber = input.nextDouble();
        System.out.print("Enter second number: ");
        double secondNumber = input.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char operation = input.next().charAt(0);
        double result;
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("Result = " + result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println("Result = " + result);
                break;
            case '*':
                result = firstNumber * secondNumber;
                System.out.println("Result = " + result);
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    result = firstNumber / secondNumber;
                    System.out.println("Result = " + result);
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
        input.close();
    }
}