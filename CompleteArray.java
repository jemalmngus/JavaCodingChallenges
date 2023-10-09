public class CompleteArray {
    static int isComplete(int[] a) {
        int min = Integer.MAX_VALUE; // Initialize to a large value
        int max = Integer.MIN_VALUE; // Initialize to a small value
        int n = a.length;

        // Find the minimum and maximum even numbers
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                min = Math.min(min, a[i]);
                max = Math.max(max, a[i]);
            }
        }

        if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE || min == max) {
            return 0; // Condition (a), (d), or (e) does not hold
        }

        // Check if all numbers between min and max are in the array
        for (int k = min + 1; k < max; k++) {
            boolean found = false;
            for (int m = 0; m < n; m++) {
                if (k == a[m]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return 0; // Condition (e) does not hold
            }
        }

        return 1; // All conditions (a), (d), and (e) hold, it's a complete array
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 2, 3, 2, 4, 8, 7};
        int[] arr2 = {5, 7, 9, 13};
        int[] arr3 = {2, 2};
        int[] arr4 = {2, 6, 3, 4};

        System.out.println(isComplete(arr1)); // Should print 1
        System.out.println(isComplete(arr2)); // Should print 0
        System.out.println(isComplete(arr3)); // Should print 0
        System.out.println(isComplete(arr4)); // Should print 0
    }
}
