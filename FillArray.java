import java.util.Arrays;

public class FillArray {
    public static int[] fill(int[] arr, int k, int n) {
        if (k <= 0 || n <= 0) {
            return null; // Handle invalid input
        }

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = arr[i % k]; // Repeating blocks of the first k elements
        }

        return arr2;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 9, 12, -2, -1};
        int[] arr2 = {4, 2, -3, 12};
        int[] arr3 = {2, 6, 9, 0, -3};

        int k1 = 3;
        int n1 = 10;

        int k2 = 1;
        int n2 = 5;

        int k3 = 0;
        int n3 = 4;

        int[] result1 = fill(arr1, k1, n1);
        int[] result2 = fill(arr2, k2, n2);
        int[] result3 = fill(arr3, k3, n3);

        System.out.println(Arrays.toString(result1)); // Should print {1, 2, 3, 1, 2, 3, 1, 2, 3, 1}
        System.out.println(Arrays.toString(result2)); // Should print {4, 4, 4, 4, 4}
        System.out.println(result3); // Should print null
    }
}
