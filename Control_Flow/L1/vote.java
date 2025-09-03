import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the person's age: ");
        int age = scanner.nextInt();

        if (checkVotingEligibility(age)) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        scanner.close();
    }

    public static boolean checkVotingEligibility(int age) {
        return age >= 18;
    }
}
