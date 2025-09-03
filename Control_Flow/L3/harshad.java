import java.util.Scanner;

public class harshad {
    public static void main(String[] args) {
        // Step 1: Get input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum to 0
        int sum = 0;

        // Step 3: Store the original number for digit processing
        int temp = number;

        // Step 4: Use a while loop to extract and sum digits
        while (temp != 0) {
            int digit = temp % 10;  // Get last digit
            sum += digit;           // Add digit to sum
            temp = temp / 10;       // Remove last digit
        }

        // Step 5: Check if number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }

        sc.close();
    }
}
