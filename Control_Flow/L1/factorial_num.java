import java.util.Scanner;

public class factorial_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        // Validate input
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;

            // Compute factorial using for loop
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            // Display result
            System.out.println("The factorial of " + num + " is " + factorial + ".");
        }

        scanner.close();
    }
}