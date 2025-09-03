import java.util.Scanner;

public class divisble_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isDivisibleBy5(number)) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
        scanner.close();
    }

    public static boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }
}
