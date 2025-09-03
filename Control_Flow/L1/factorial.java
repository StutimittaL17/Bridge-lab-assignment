import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        // Check if the input is valid
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;
            int i = 1;

            // Compute factorial using while loop
            while (i <= num) {
                factorial *= i;
                i++;
            }

            // Print the result
            System.out.println("The factorial of " + num + " is " + factorial + ".");
        }

        scanner.close();
    }
}