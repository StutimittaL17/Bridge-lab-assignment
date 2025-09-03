public class smallest_number {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 2, 8, 1};
        int smallest = findSmallestNumber(numbers);
        System.out.println("The smallest number is: " + smallest);
    }

    public static int findSmallestNumber(int[] numbers) {
        int smallest = numbers[0];
        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }
}
