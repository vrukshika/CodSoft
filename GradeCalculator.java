import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subjects = { "Math", "Science", "English", "Computer", "Hindi" };
        int len = subjects.length;
        int sum = 0, avg;
        char grade;

        int[] marks = new int[len];

        System.out.println("Enter your marks for each subject out of 100:");

        for (int i = 0; i < len; i++) {
            System.out.print(subjects[i] + " marks: ");
            marks[i] = sc.nextInt();

            if (marks[i] > 100 || marks[i] < 0) {
                System.out.println("Entered incorrect marks! Please enter marks between 0 and 100.");
                return; // Exit the program if incorrect marks are entered
            }
            sc.close();
        }

        // Calculating sum of marks
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        // Calculating average
        avg = sum / len;

        // Determining the grade
        if (avg > 90) {
            grade = 'O';
        } else if (avg > 80) {
            grade = 'A';
        } else if (avg > 70) {
            grade = 'B';
        } else if (avg > 60) {
            grade = 'C';
        } else if (avg > 50) {
            grade = 'D';
        } else if (avg > 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Displaying the result
        System.out.println("Your result:");
        System.out.println("Total Marks (out of 500): " + sum);
        System.out.println("Percentage (%): " + avg);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
