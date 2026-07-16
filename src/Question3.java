import java.util.Scanner;
public class Question3 {
    public static int countEvenNumbers(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = input.nextInt();
        System.out.println("Even Numbers Count = " + countEvenNumbers(n));
    }
}