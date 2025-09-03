import java.util.Scanner;

public class sum_of_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double number;

        System.out.print("Enter a number (0 to stop): ");
        number = scanner.nextDouble();

        while (number != 0) {
            total += number;
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextDouble();
        }

        System.out.println("The sum of the numbers is: " + total);
        scanner.close();
    }
}
