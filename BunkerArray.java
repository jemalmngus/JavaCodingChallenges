public class BunkerArray {
    static int isBunkerArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int current = a[i];
            int next = a[i + 1];

            if (isOdd(current) && isPrime(next)) {
                return 1; // It's a Bunker array
            }
        }
        return 0; // It's not a Bunker array
    }

    static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bunkerArray1 = {4, 9, 6, 7, 3};
        int[] bunkerArray2 = {4, 9, 6, 15, 21};

        int result1 = isBunkerArray(bunkerArray1);
        int result2 = isBunkerArray(bunkerArray2);

        System.out.println("Result 1: " + result1); // Should print 1 (Bunker array)
        System.out.println("Result 2: " + result2); // Should print 0 (Not a Bunker array)
    }
}
