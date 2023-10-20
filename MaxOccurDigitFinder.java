public class MaxOccurDigitFinder {
    public static int maxOccurDigit(int n) {
        if (n < 0) {
            n = -n; // Make sure we work with the absolute value of n
        }

        int[] digitCount = new int[10]; // Initialize an array to count occurrences of each digit

        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            digitCount[digit]++; // Increment the count for that digit
            n /= 10; // Remove the last digit
        }

        int maxCount = 0;
        int maxDigit = -1;

        for (int i = 0; i < 10; i++) {
            if (digitCount[i] > maxCount) {
                maxCount = digitCount[i];
                maxDigit = i;
            } else if (digitCount[i] == maxCount) {
                maxCount = 0;
                maxDigit = -1;
            }
        }

        if (maxCount > 0) {
            return maxDigit; // Return the digit that occurs the most
        } else {
            return -1; // No digit occurs more than once
        }
    }

    public static void main(String[] args) {
        System.out.println(maxOccurDigit(327277)); // Output: 7
        System.out.println(maxOccurDigit(33331)); // Output: 3
        System.out.println(maxOccurDigit(3232)); // Output: -1
        System.out.println(maxOccurDigit(5)); // Output: 5
        System.out.println(maxOccurDigit(-9895)); // Output: 9
    }
}
