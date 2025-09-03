import java.util.Scanner;

public class gfactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number < 2) {
            System.out.println("Please enter an integer greater than 1.");
            sc.close();
            return;
        }

        int greatestFactor = 1;
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        sc.close();
    }
}
