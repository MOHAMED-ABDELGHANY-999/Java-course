import java.util.Scanner;
public class Question2 {
    public static String gradeStudent(int score) {
        if (score >= 90) {
            return "Excellent";
        } else if (score >= 75) {
            return "Very Good";
        } else if (score >= 60) {
            return "Good";
        } else {
            return "Fail";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Score: ");
        int score = input.nextInt();
        System.out.println("Grade: " + gradeStudent(score));
    }
}