import java.util.Scanner;

public class natural_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isNaturalNumber(n)) {
            int sum = calculateNaturalSum(n);
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
        scanner.close();
    }

    public static boolean isNaturalNumber(int n) {
        return n > 0;
    }

    public static int calculateNaturalSum(int n) {
        return (n * (n + 1)) / 2;


}    }
