
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int subjects;

        do {
            System.out.print("Enter number of subjects (1-10): ");
            subjects = sc.nextInt();

            if (subjects < 1 || subjects > 10) {
                System.out.println("Invalid number of subjects!");
            }

        } while (subjects < 1 || subjects > 10);

        int totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {

            int marks;

            do {
                System.out.print("Enter marks for subject " + i + " (0-100): ");
                marks = sc.nextInt();

                if (marks < 0 || marks > 100) {
                    System.out.println("Marks must be between 0 and 100.");
                }

            } while (marks < 0 || marks > 100);

            totalMarks += marks;
        }

        System.out.println("Total Marks: " + totalMarks);

        double percentage = (double) totalMarks / subjects;

        System.out.println("Percentage: " + percentage + "%");

        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);

        System.out.println("Maximum Possible Marks: " + (subjects * 100));
        System.out.println("Marks Obtained: " + totalMarks);

        sc.close();
    }
}
