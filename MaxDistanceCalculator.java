public class MaxDistanceCalculator {
    public static int maxDistance(int n) {
        if (n < 4) {
            return -1; // No non-trivial factors for n less than 4
        }

        int firstFactor = -1;
        int lastFactor = -1;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                firstFactor = i;
                break;
            }
        }

        if (firstFactor == -1) {
            return -1; // n is prime, no non-trivial factors
        }

        for (int i = n / firstFactor; i >= firstFactor; i--) {
            if (n % i == 0) {
                lastFactor = i;
                break;
            }
        }

        return lastFactor - firstFactor;
    }

    public static void main(String[] args) {
        System.out.println(maxDistance(1001)); // Output: 136
        System.out.println(maxDistance(8));    // Output: 2
        System.out.println(maxDistance(7));    // Output: -1
        System.out.println(maxDistance(49));   // Output: 0
    }
}
