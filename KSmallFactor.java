public class KSmallFactor {
    public static boolean hasKSmallFactors(int k, int n) {
        if (k <= 0 || n <= 0) {
            return false; // Handle invalid input
        }

        for (int u = 1; u < k; u++) {
            if (n % u == 0) {
                int v = n / u;
                if (v < k) {
                    return true; // Found k-small factors
                }
            }
        }

        return false; // No k-small factors found
    }

    public static void main(String [] args) {
        System.out.println(hasKSmallFactors(7, 30)); // Should print true
        System.out.println(hasKSmallFactors(6, 14)); // Should print false
        System.out.println(hasKSmallFactors(6, 30)); // Should print false
    }
}
