public class IsSymmetricArray {
    public static int isSym(int[] a) {
        int n = a.length;

        for (int i = 0; i < n / 2; i++) {
            if (a[i] % 2 != a[n - i - 1] % 2) {
                return 0; // Check if even and odd elements don't match from both ends
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] example1 = {2, 7, 9, 10, 11, 5, 8};
        int[] example2 = {9, 8, 7, 13, 14, 17};
        int[] example3 = {2, 7, 8, 9, 11, 13, 10};

        System.out.println(isSym(example1)); // Output: 1 (isSym array)
        System.out.println(isSym(example2)); // Output: 1 (isSym array)
        System.out.println(isSym(example3)); // Output: 0 (not isSym array)
    }
}
