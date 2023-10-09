public class PrimeProductChecker {
    // Helper function to check if a number is a prime product
    public static int isPrimeProduct(int n) {
        if (n < 4) {
            return 0; // Prime products must be greater than 3
        }

        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) == 1 && isPrime(n / i) == 1 && i * (n / i) == n) {
                return 1; // It's a prime product
            }
        }

        return 0; // Not a prime product
    }

    // Example of isPrime function (provided)
    public static int isPrime(int m) {
        if (m <= 1) {
            return 0; // Not prime
        }
        if (m <= 3) {
            return 1; // 2 and 3 are prime
        }
        if (m % 2 == 0 || m % 3 == 0) {
            return 0; // Divisible by 2 or 3, not prime
        }
        for (int i = 5; i * i <= m; i += 6) {
            if (m % i == 0 || m % (i + 2) == 0) {
                return 0; // Divisible by factors other than 1 and itself, not prime
            }
        }
        return 1; // Prime
    }

    public static void main(String[] args) {
        int n1 = 22;
        int n2 = 35;
        int n3 = 7;

        System.out.println(isPrimeProduct(n1)); // Should print 1
        System.out.println(isPrimeProduct(n2)); // Should print 1
        System.out.println(isPrimeProduct(n3)); // Should print 0
    }
}
