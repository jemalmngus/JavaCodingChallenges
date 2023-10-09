import java.util.*;

public class SudokuMissingDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sudokuLine = scanner.nextLine();
        scanner.close();

        boolean[] seenDigits = new boolean[10]; // An array to track seen digits (0-9)

        for (char c : sudokuLine.toCharArray()) {
            if (c != '?') {
                int digit = c - '0'; // Convert the character to an integer
                seenDigits[digit] = true; // Mark the digit as seen
            }
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (!seenDigits[digit]) {
                System.out.println(digit);
                break;
            }
        }
    }
}
