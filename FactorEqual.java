public class FactorEqual {

    public static int factorEqual(int n, int m) {
        int countN = 2;
        int countM = 2;
        if (n < 0 || m < 0)
            return 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                countN++;
            }
        }

        for (int i = 2; i < m; i++) {
            if (m % i == 0) {
                countM++;
            }
        }

        return countN == countM ? 1 : 0;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int m1 = 33;
        int n2 = 9;
        int m2 = 10;

        System.out.println("factorEqual(" + n1 + ", " + m1 + ") returns " + factorEqual(n1, m1)); // Should return 1
        System.out.println("factorEqual(" + n2 + ", " + m2 + ") returns " + factorEqual(n2, m2)); // Should return 0
    }
}
