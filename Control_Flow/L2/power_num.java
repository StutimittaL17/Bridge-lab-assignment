import java.util.Scanner;

public class power_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base (positive integer): ");
        int number = sc.nextInt();
        System.out.print("Enter the exponent (positive integer): ");
        int power = sc.nextInt();

        if (number < 1 || power < 1) {
            System.out.println("Please enter positive integers for both base and exponent.");
            return;
        }

        int result = 1;
        int counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}
