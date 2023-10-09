public class EvensChecker {
    public static int isEvens(int number) {
        // Ensure the number is positive (assuming non-negative integers)
        if (number < 0) {
            number = -number;
        }

        // Initialize a flag to check if any digit is odd
        boolean hasOddDigit = false;

        while (number > 0) {
            // Extract the rightmost digit
            int digit = number % 10;

            // Check if the digit is odd
            if (digit % 2 != 0) {
                hasOddDigit = true;
                break; // No need to continue checking
            }

            // Remove the rightmost digit
            number /= 10;
        }

        // If any digit was odd, return 0; otherwise, return 1
        return hasOddDigit ? 0 : 1;
    }

    public static void main(String[] args) {
        int number1 = 2426;
        int number2 = 3224;

        System.out.println(isEvens(number1)); // Should print 1
        System.out.println(isEvens(number2)); // Should print 0
    }
}
