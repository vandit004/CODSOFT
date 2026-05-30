
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {

            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();

            totalMarks += marks;
        }

        System.out.println("Total Marks: " + totalMarks);

        double percentage = (double) totalMarks / subjects;

        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}
