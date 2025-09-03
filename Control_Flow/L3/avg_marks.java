import java.util.Scanner;

public class avg_marks {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Input marks for three subjects
            System.out.print("Enter marks in Physics: ");
            int physics = sc.nextInt();
            System.out.print("Enter marks in Chemistry: ");
            int chemistry = sc.nextInt();
            System.out.print("Enter marks in Maths: ");
            int maths = sc.nextInt();

            // Calculate average and percentage
            int total = physics + chemistry + maths;
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Determine grade and remarks
            String grade, remarks;
            if (percentage >= 90) {
                grade = "A+";
                remarks = "Excellent";
            } else if (percentage >= 80) {
                grade = "A";
                remarks = "Very Good";
            } else if (percentage >= 70) {
                grade = "B";
                remarks = "Good";
            } else if (percentage >= 60) {
                grade = "C";
                remarks = "Average";
            } else if (percentage >= 50) {
                grade = "D";
                remarks = "Pass";
            } else {
                grade = "F";
                remarks = "Fail";
            }

            // Output results
            System.out.printf("Average Marks: %.2f\n", average);
            System.out.printf("Percentage: %.2f%%\n", percentage);
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);
        }
    }
}
