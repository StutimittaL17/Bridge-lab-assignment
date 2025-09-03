import java.util.Scanner;

public class rocket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int counter = scanner.nextInt();
        System.out.println("Rocket launch will happen in " + counter + " seconds.");

        for (int i = counter; i > 0; i--) {
            System.out.println("T-minus " + i + " seconds");
            try {
                Thread.sleep(1000); // sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Countdown interrupted!");
            }
        }
        System.out.println("Liftoff!");
        scanner.close();
    }
}
