import java.util.Scanner;
public class Main {
    public static double calculateDiscount(double price, double discountPercentage) {
        double discount = price * discountPercentage / 100;
        return price - discount;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Price: ");
        double price = input.nextDouble();
        System.out.print("Enter Discount Percentage: ");
        double discountPercentage = input.nextDouble();
        double finalPrice = calculateDiscount(price, discountPercentage);
        System.out.println("Final Price = " + finalPrice);
    }
}