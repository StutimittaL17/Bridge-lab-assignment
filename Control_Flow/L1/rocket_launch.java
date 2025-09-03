import java.util.Scanner;

public class rocket_launch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter countdown start value: ");
            int counter = scanner.nextInt();
            System.out.println("Rocket launch will happen in " + counter + " seconds.");

        while (counter > 0) {
            System.out.println("T-minus " + counter + " seconds");
            counter--;
            try {
                Thread.sleep(1000); // sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Countdown interrupted!");
            }
        }
        System.out.println("Liftoff!");
        }
    }
}
