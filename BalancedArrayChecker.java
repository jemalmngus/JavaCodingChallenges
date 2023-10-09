public class BalancedArrayChecker {
    public static int isBalanced(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0 && a[i] % 2 != 0) {
                return 0; // Even index with odd value, not balanced
            } else if (i % 2 != 0 && a[i] % 2 == 0) {
                return 0; // Odd index with even value, not balanced
            }
        }
        return 1; // All elements satisfy the conditions, it's a balanced array
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 6, 7};
        int[] arr2 = {6, 7, 2, 3, 12};
        int[] arr3 = {7, 15, 2, 3};
        int[] arr4 = {16, 6, 2, 3};

        System.out.println(isBalanced(arr1)); // Should print 1
        System.out.println(isBalanced(arr2)); // Should print 1
        System.out.println(isBalanced(arr3)); // Should print 0
        System.out.println(isBalanced(arr4)); // Should print 0
    }
}
