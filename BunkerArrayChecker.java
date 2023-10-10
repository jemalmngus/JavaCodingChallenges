public class BunkerArrayChecker {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to check if an array is a Bunker array
    public static int isBunker(int[] a) {
        boolean containsPrime = false;
        boolean containsOne = false;

        for (int num : a) {
            if (num == 1) {
                containsOne = true;
            } else if (isPrime(num)) {
                containsPrime = true;
            }
        }

        if (containsPrime && containsOne) {
            return 1; // It's a Bunker array
        } else {
            return 0; // It's not a Bunker array
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 6, 10, 1};
        int[] arr2 = {7, 6, 10};
        int[] arr3 = {6, 10, 1};
        int[] arr4 = {3, 7, 1, 8, 1};

        System.out.println(isBunker(arr1)); // Output: 1
        System.out.println(isBunker(arr2)); // Output: 0
        System.out.println(isBunker(arr3)); // Output: 0
        System.out.println(isBunker(arr4)); // Output: 1
    }
}
