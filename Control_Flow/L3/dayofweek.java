public class dayofweek {
    public static void main(String[] args) {
        // Step 1: Parse command-line arguments
        int m = Integer.parseInt(args[0]); // Month
        int d = Integer.parseInt(args[1]); // Day
        int y = Integer.parseInt(args[2]); // Year

        // Step 2: Adjust month and year for Zeller's formula
        if (m < 3) {
            m += 12;
            y -= 1;
        }

        // Step 3: Apply Zeller's Congruence
        int k = y % 100;       // Year of the century
        int j = y / 100;       // Zero-based century

        int h = (d + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

        // Step 4: Convert Zeller's output to required format
        int dayOfWeek = (h + 6) % 7; // Zeller's: 0=Saturday, so shift to 0=Sunday

        // Step 5: Print result
        System.out.println(dayOfWeek);
    }
}
