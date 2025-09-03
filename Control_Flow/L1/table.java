import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number to generate its multiplication table (from 2 to 9): ");
        int number = scanner.nextInt();

        // Print multiplication table from 6 to 9
        System.out.println("Multiplication table of " + number + " from 2 to 9:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        scanner.close();
    }
}