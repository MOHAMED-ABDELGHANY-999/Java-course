import java.util.Scanner;
public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] studentNames = new String[5];
        double[][] marks = new double[5][3];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student name: ");
            studentNames[i] = input.next();
            double sum = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter mark " + (j + 1) + ": ");
                marks[i][j] = input.nextDouble();
                sum += marks[i][j];
            }
            double average = sum / 3;
            String grade;
            if (average >= 90) {
                grade = "Excellent";
            } else if (average >= 75) {
                grade = "Good";
            } else if (average >= 50) {
                grade = "Pass";
            } else {
                grade = "Fail";
            }
            System.out.println("\nStudent: " + studentNames[i]);
            System.out.println("Average: " + average);
            System.out.println("Grade: " + grade);
            System.out.println();
        }
        for (int subject = 0; subject < 3; subject++) {
            double highest = marks[0][subject];
            double lowest = marks[0][subject];
            for (int student = 1; student < 5; student++) {
                if (marks[student][subject] > highest) {
                    highest = marks[student][subject];
                }
                if (marks[student][subject] < lowest) {
                    lowest = marks[student][subject];
                }
            }
            System.out.println("Subject " + (subject + 1));
            System.out.println("Highest Mark: " + highest);
            System.out.println("Lowest Mark: " + lowest);
            System.out.println();
        }
        input.close();
    }
}