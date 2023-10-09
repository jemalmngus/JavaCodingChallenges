import java.util.Scanner;

public class PatternRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        String s = scanner.nextLine();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        // Read and discard the newline character
        scanner.nextLine();

        // Create a character array to store the input string
        char[] inputArray = s.toCharArray();

        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                // Calculate the minimum distance to the border in each direction
                int minX = Math.min(x, w - 1 - x);
                int minY = Math.min(y, h - 1 - y);

                // Find the minimum of these distances
                int minDistance = Math.min(minX, minY);

                // Calculate the index in the input string based on the minimum distance
                int index = minDistance % s.length();

                // Print the character at the calculated index
                System.out.print(inputArray[index]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
