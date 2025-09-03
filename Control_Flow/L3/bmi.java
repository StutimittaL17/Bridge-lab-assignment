import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        // Step 1: Get user input for weight (kg) and height (cm)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();

        // Step 2: Convert height from cm to meters
        double heightM = heightCm / 100;

        // Step 3: Calculate BMI using the formula
        double bmi = weight / (heightM * heightM);

        // Step 4: Display the BMI value
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Step 5: Determine weight status based on BMI
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

        sc.close();
    }
}
