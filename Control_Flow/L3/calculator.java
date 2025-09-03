import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // Step 1: Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Step 2: Get input for two numbers
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        // Step 3: Get input for operator
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        // Step 4: Use switch...case to perform operation
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
        }

        sc.close();
    }
}
