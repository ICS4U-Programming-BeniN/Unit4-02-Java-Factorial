import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public final class Factorial {
    private Factorial() {
    } // Prevent instantiation
    /**
     * Main method to read input, compute factorial, and write output.
     * @param args Command-line arguments (not used).
     */
    public static void main(final String[] args) {
        try {
            // Read from input.txt
            File inputFile = new File("input.txt");
            Scanner scanner = new Scanner(inputFile);

            int number = 0;
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            }
            scanner.close();

            // Compute factorial using recursion
            long result = factorial(number);

            // Write to output.txt
            FileWriter writer = new FileWriter("output.txt");
            writer.write(Long.toString(result));
            writer.close();

            System.out.println("Factorial written to output.txt.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Recursive method to compute factorial of a number.
     * @param n The number to compute factorial for.
     * @return Factorial of n.
     */
    public static long factorial(final int n) {
        if (n <= 1) {
            // Base case
            return 1;
        }
        // Recursive call
        return n * factorial(n - 1);
    }
}
