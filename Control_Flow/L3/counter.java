import java.util.Scanner;

public class counter {
    public static void main(String[] args) {
        // Step 1: Get input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Step 2: Initialize count to 0
        int count = 0;

        // Step 3: Handle the case when number is 0
        if (number == 0) {
            count = 1;
        } else {
            // Step 4: Use a loop to count digits
            while (number != 0) {
                // Step 5: Remove the last digit
                number = number / 10;

                // Step 6: Increment the count
                count++;
            }
        }

        // Step 7: Display the result
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
