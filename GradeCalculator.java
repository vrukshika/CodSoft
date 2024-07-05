import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String subject[] = { "Math", "Science", "English", "Computer", "Hindi" };
        int len = subject.length;
        int sum = 0, avg;
        char grade;

        int marks[] = new int[len];

        System.out.println("Enter your each subject marks out of 100:");

        for (int i = 0; i < len; i++) {
            System.out.print(subject[i] + " marks:");
            marks[i] = sc.nextInt();

            if (marks[i] > 100) {
                System.out.println("entered incorrect marks!");
            }
           
        }

        // System.out.print(subject[0] + " marks:");
        // marks[0] = sc.nextInt();

        // System.out.print(subject[1] + " marks:");
        // marks[1] = sc.nextInt();

        // System.out.print(subject[2] + " marks:");
        // marks[2] = sc.nextInt();

        // System.out.print(subject[3] + " marks:");
        // marks[3] = sc.nextInt();

        // System.out.print(subject[4] + " marks:");
        // marks[4] = sc.nextInt();

        //calculating sum of marks

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];

            // calculating sum of marks
            avg = sum / len;

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

            System.out.println("Your result:");
            System.out.println("Total Marks(out of 500):" + sum + " \nPercentage(%):" + avg + " \nGrade:" + grade);

            sc.close();
        }
    }
}
