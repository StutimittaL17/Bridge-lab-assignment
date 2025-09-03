import java.util.Scanner;

public class abundant {
    public static void main(String[] args) {
        // Step 1: Get input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum to 0
        int sum = 0;

        // Step 3: Run a loop to find all proper divisors
        for (int i = 1; i < number; i++) {
            // Step 4: Check if i is a divisor of number
            if (number % i == 0) {
                sum += i; // Add divisor to sum
            }
        }

        // Step 5: Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }

        sc.close();
    }
}
