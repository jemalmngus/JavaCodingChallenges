public class MagicArrayChecker {
    // Helper function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // If divisible by any number between 2 and the square root, not prime
            }
        }
        return true;
    }

    // Main function to check if an array is a Magic array
    public static int isMagicArray(int[] a) {
        if (a.length == 0) {
            return 0; // Empty array, not a Magic array
        }

        int sumOfPrimes = 0;

        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                sumOfPrimes += a[i];
            }
        }

        if (sumOfPrimes == 0 && a[0] == 0) {
            return 1; // Special case: No primes, and the first element is 0
        }

        return (sumOfPrimes == a[0]) ? 1 : 0; // Check if the sum of primes equals the first element
    }

    public static void main(String[] args) {
        int[] arr1 = {21, 3, 7, 9, 11, 4, 6};
        int[] arr2 = {13, 4, 4, 4, 4};
        int[] arr3 = {10, 5, 5};
        int[] arr4 = {0, 6, 8, 20};
        int[] arr5 = {3};
        int[] arr6 = {0};

        System.out.println(isMagicArray(arr1)); // Should print 1
        System.out.println(isMagicArray(arr2)); // Should print 1
        System.out.println(isMagicArray(arr3)); // Should print 1
        System.out.println(isMagicArray(arr4)); // Should print 1
        System.out.println(isMagicArray(arr5)); // Should print 1
        System.out.println(isMagicArray(arr6)); // Should print 0
    }
}
