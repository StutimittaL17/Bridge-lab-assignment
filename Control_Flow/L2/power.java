import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the base (positive integer): ");
            int number = sc.nextInt();
            System.out.print("Enter the exponent (positive integer): ");
            int exponent = sc.nextInt();

            if (number < 1 || exponent < 1) {
                System.out.println("Please enter positive integers for both base and exponent.");
                return;
            }

            int result = 1;
            for (int i = 1; i <= exponent; i++) {
                result *= number;
            }

            System.out.println(number + " raised to the power " + exponent + " is: " + result);
        }
    }
}
