import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        // Step 1: Get input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum to 0
        int sum = 0;

        // Step 3: Store the original number for comparison later
        int originalNumber = number;

        // Step 4: Use a while loop to process each digit
        while (originalNumber != 0) {
            // Step 5: Get the last digit using modulus
            int digit = originalNumber % 10;

            // Step 6: Add the cube of the digit to the sum
            sum += Math.pow(digit, 3);

            // Step 7: Remove the last digit using integer division
            originalNumber = originalNumber / 10;
        }

        // Step 8: Check if the sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        sc.close();
    }
}
